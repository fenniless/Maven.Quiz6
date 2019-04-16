package rocks.zipcode.io.fundamentals;
import java.util.Arrays;
import java.util.List;

public class BasicStringUtils {
    private static List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        return String.copyValueOf(chars);
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        StringBuilder str = new StringBuilder();
        for (Character c: chars
             ) {
            str.append(c.toString());
        }
        return str.toString();
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        StringBuilder str = new StringBuilder();
        for (Character c: toArray(string)
             ) {
            if(!vowels.contains(c)){
                str.append(c.toString());
            }
        }
        return str.toString();
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        List<Character> chars = Arrays.asList(toArray(charactersToRemove));
        StringBuilder str = new StringBuilder();
        for (Character c: toArray(string)
        ) {
            if(!chars.contains(c)){
                str.append(c.toString());
            }
        }
        return str.toString();
    }

    private static Character[] toArray(String string) {
        Character[] characters = new Character[string.length()];
        for (int i = 0; i < string.length(); i++) {
            characters[i] = string.charAt(i);
        }
        return characters;
    }
}
