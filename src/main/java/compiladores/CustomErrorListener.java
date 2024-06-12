package compiladores;

import org.antlr.v4.runtime.*;

public class CustomErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg, RecognitionException e) {
        Escucha.errors.add("Error sintáctico en línea " + line + ":" + charPositionInLine + " - " + msg);
    }
}
