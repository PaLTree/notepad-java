/**
 * Karaffe Programming Language
 */
package net.nokok.karaffe.parser.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import net.nokok.karaffe.parser.ParseException;
import net.nokok.karaffe.parser.ParserConstants;
import net.nokok.karaffe.parser.Token;
import net.nokok.karaffe.parser.excptn.ParserException;

public class OutputFormatter {

    private final List<String> sourceCode;

    public OutputFormatter(String fileName) {
        try {
            sourceCode = Files.readAllLines(new File(fileName).toPath());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void print(ParserException e) {
        print("KaraffeParserException", null, null, null);
    }

    public void print(IOException e) {
        System.out.println("ファイルが見つかりません:" + e.getMessage());
    }

    public void print(ParseException ex) {
        Token t = ex.currentToken.next;
        print(t.beginLine, t.beginColumn, t.endColumn, null, ErrorType.SYNTAX_ERROR);
        System.out.println("期待している次のトークン");
        for (int[] tmp : ex.expectedTokenSequences) {
            for (int expected : tmp) {
                System.out.println(ParserConstants.tokenImage[expected]);
            }
        }
        System.out.println("実際に渡されたトークン");
        String image = ex.currentToken.next.image;
        System.out.println(image.equals("\n") ? "[NewLine]" : image);
    }

    public void print(String line, Token errorToken, String message, ErrorType type) {
        print(line, errorToken.beginColumn, errorToken.endColumn, message, type);
    }

    public void print(String line, int from, int to, String message, ErrorType type) {
        System.out.println(type);
        if (message != null) {
            System.out.println(message);
        }
        if (line != null) {
            System.out.println(line);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < from; i++) {
            sb.append(' ');
        }
        for (int i = from; i < to; i++) {
            sb.append('^');
        }
        System.out.println(sb.toString());
    }

    public void print(int lineNumber, int fromColumn, int toColumn, String errorMessage, ErrorType type) {
        System.out.println(type);
        System.out.println("");
        System.out.println(sourceCode.get(lineNumber - 1));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < fromColumn; i++) {
            sb.append(' ');
        }
        for (int i = fromColumn; i <= toColumn; ++i) {
            sb.append('^');
        }
        System.out.println(sb.toString());

    }

}
