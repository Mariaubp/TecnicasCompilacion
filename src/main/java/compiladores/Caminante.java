package compiladores;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Caminante {
    public static void main(String[] args) throws Exception {
        // Cambia "input.c" al nombre del archivo que quieres analizar
        CharStream input = CharStreams.fromFileName("input.c");
        CompiladoresLexer lexer = new CompiladoresLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CompiladoresParser parser = new CompiladoresParser(tokens);

        parser.removeErrorListeners(); // Remove default ConsoleErrorListener
        parser.addErrorListener(new CustomErrorListener()); // Add custom error listener

        ParseTree tree = parser.programa(); // parse
        ParseTreeWalker walker = new ParseTreeWalker();
        Escucha escucha = new Escucha();
        walker.walk(escucha, tree);

        // Output symbol table
        System.out.println("Tabla de símbolos:");
        for (Map.Entry<String, Symbol> entry : escucha.getSymbolTable().entrySet()) {
            Symbol symbol = entry.getValue();
            System.out.println(entry.getKey() + ": tipo=" + symbol.type + ", inicializado=" + symbol.initialized + ", usado=" + symbol.used);
        }

        // Output errors
        if (!escucha.getErrors().isEmpty()) {
            System.out.println("Errores encontrados:");
            for (String error : escucha.getErrors()) {
                System.out.println(error);
            }
        } else {
            System.out.println("No se encontraron errores.");
        }
    }
}
