package compiladores;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import compiladores.CompiladoresParser.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Escucha extends compiladoresBaseListener {
    private static class Symbol {
        String type;
        boolean initialized;
        boolean used;

        Symbol(String type) {
            this.type = type;
            this.initialized = false;
            this.used = false;
        }
    }

    private Map<String, Symbol> symbolTable = new HashMap<>();
    private Set<String> declaredIdentifiers = new HashSet<>();
    private Set<String> usedIdentifiers = new HashSet<>();
    private Set<String> errors = new HashSet<>();

    @Override
    public void enterDeclaracionFuncion(DeclaracionFuncionContext ctx) {
        String tipo = ctx.tipo().getText();
        String id = ctx.ID().getText();
        if (symbolTable.containsKey(id)) {
            errors.add("Error semántico: Doble declaración del identificador '" + id + "'.");
        } else {
            symbolTable.put(id, new Symbol(tipo));
            declaredIdentifiers.add(id);
        }
    }

    @Override
    public void enterDeclaracionVariable(DeclaracionVariableContext ctx) {
        String tipo = ctx.tipo().getText();
        for (DeclaradorContext declaradorCtx : ctx.listaDeclaradores().declarador()) {
            String id = declaradorCtx.ID().getText();
            if (symbolTable.containsKey(id)) {
                errors.add("Error semántico: Doble declaración del identificador '" + id + "'.");
            } else {
                symbolTable.put(id, new Symbol(tipo));
                declaredIdentifiers.add(id);
            }
        }
    }

    @Override
    public void enterAsignacion(AsignacionContext ctx) {
        String id = ctx.ID().getText();
        if (!symbolTable.containsKey(id)) {
            errors.add("Error semántico: Uso de identificador no declarado '" + id + "'.");
        } else {
            symbolTable.get(id).initialized = true;
            usedIdentifiers.add(id);
        }
    }

    @Override
    public void enterTermino(TerminoContext ctx) {
        if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            if (!symbolTable.containsKey(id)) {
                errors.add("Error semántico: Uso de identificador no declarado '" + id + "'.");
            } else {
                usedIdentifiers.add(id);
                symbolTable.get(id).used = true;
            }
        }
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        // Report unused identifiers
        for (String id : declaredIdentifiers) {
            if (!usedIdentifiers.contains(id)) {
                errors.add("Advertencia: Identificador declarado pero no usado: " + id);
            }
        }
    }

    public Map<String, Symbol> getSymbolTable() {
        return symbolTable;
    }

    public Set<String> getErrors() {
        return errors;
    }
}
