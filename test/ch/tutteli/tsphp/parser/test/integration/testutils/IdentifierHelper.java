package ch.tutteli.tsphp.parser.test.integration.testutils;

public class IdentifierHelper
{

    private IdentifierHelper() {
    }

    public static String getAllLowerCaseCharacters() {
        return getCharacterFromStartToEndAsString(97, 122);
    }

    public static String getAllUpperCaseCharacters() {
        return getCharacterFromStartToEndAsString(65, 90);
    }

    public static String getAllDigits() {
        return getCharacterFromStartToEndAsString(48, 57);
    }

    public static String getAllSpecialCharacters() {
        return getCharacterFromStartToEndAsString(127, 255);
    }

    public static String getCharacterFromStartToEndAsString(int start, int end) {
        StringBuilder buffer = new StringBuilder();
        for (int i = start; i <= end; ++i) {
            buffer.append((char) i);
        }
        return buffer.toString();
    }

    public static String asciiToString(int asciiCode) {
        return String.valueOf((char) asciiCode);
    }
}
