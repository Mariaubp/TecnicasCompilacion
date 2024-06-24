package compiladores;

import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.List;

public class CustomErrorListener extends BaseErrorListener {
    private List<String> syntaxErrors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg, RecognitionException e) {
        String error = "Error sintáctico en línea " + line + ":" + charPositionInLine + " - " + msg;
        syntaxErrors.add(error);
        System.err.println(error); // Opcional, para ver errores en la consola
    }

    public List<String> getSyntaxErrors() {
        return syntaxErrors;
    }
}
