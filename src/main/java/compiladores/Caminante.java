package compiladores;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Map;

public class Caminante {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Caminante <input file>");
            return;
        }

        String inputFile = args[0];
        CharStream input = CharStreams.fromFileName(inputFile);
        CompiladoresLexer lexer = new CompiladoresLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CompiladoresParser parser = new CompiladoresParser(tokens);

        parser.removeErrorListeners(); // Remove default ConsoleErrorListener
        CustomErrorListener errorListener = new CustomErrorListener();
        parser.addErrorListener(errorListener); // Add custom error listener

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
        if (!escucha.getErrors().isEmpty() || !errorListener.getSyntaxErrors().isEmpty()) {
            System.out.println("Errores encontrados:");
            for (String error : escucha.getErrors()) {
                System.out.println(error);
            }
            for (String error : errorListener.getSyntaxErrors()) {
                System.out.println(error);
            }
        } else {
            System.out.println("No se encontraron errores.");
        }
    }

}
