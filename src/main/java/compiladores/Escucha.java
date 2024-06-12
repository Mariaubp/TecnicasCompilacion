package compiladores;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import compiladores.compiladoresParser.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Escucha extends compiladoresBaseListener {
    private Integer nodos = 0;
    private Integer hojas = 0;

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
    public void enterEveryRule(ParserRuleContext ctx) {
        nodos++;
    }

    @Override
    public void enterInstruccion(InstruccionContext ctx) {
        // Implement any specific logic for entering instructions if needed
    }

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        System.out.println("Comienza la compilacion");
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // Implement any specific logic for exiting rules if needed
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        System.out.println("Fin de la compilacion");
        
        // Report symbol table
        System.out.println("Tabla de símbolos:");
        for (Map.Entry<String, Symbol> entry : symbolTable.entrySet()) {
            Symbol symbol = entry.getValue();
            System.out.println(entry.getKey() + ": tipo=" + symbol.type + ", inicializado=" + symbol.initialized + ", usado=" + symbol.used);
        }

        // Report errors
        if (!errors.isEmpty()) {
            System.out.println("Errores encontrados:");
            for (String error : errors) {
                System.out.println(error);
            }
        } else {
            System.out.println("No se encontraron errores.");
        }

        // Report unused identifiers
        for (String id : declaredIdentifiers) {
            if (!usedIdentifiers.contains(id)) {
                System.out.println("Advertencia: Identificador declarado pero no usado: " + id);
            }
        }
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        hojas++;
        System.out.println("Estoy en una HOJA --> " + node.getText());
    }

    @Override
    public void enterDeclaracion(DeclaracionContext ctx) {
        String tipo = ctx.tipo().getText();
        for (TerminalNode idNode : ctx.listaDeclaradores().ID()) {
            String id = idNode.getText();
            if (symbolTable.containsKey(id)) {
                errors.add("Error semántico: Doble declaración del identificador '" + id + "'.");
            } else {
                symbolTable.put(id, new Symbol(tipo));
                declaredIdentifiers.add(id);
            }
        }
    }

    @Override
    public void exitDeclaracion(DeclaracionContext ctx) {
        System.out.println("  fin   : " + ctx.getText());
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
    public String toString() {
        return "Escucha [nodos=" + nodos + ", hojas=" + hojas + "]";
    }

    public Map<String,Symbol> getSymbolTable(){
     return symbolTable;
    }
    public Set<String> getErrors() {
        return errors;
    }
}

