
public class PrintOddPositionChars {

    public static void main(String[] args) {
        String text = "type here to search";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // this line extracts the character from text strin abd assign i to the variable
                                      // ch and it extarcts with the index i with the help ofcharAt(i)
                                      // in the index position

            // Check if character is not a whitespace and the index is odd (starting from 0)
            if (!Character.isWhitespace(ch) && i % 2 != 0) {
                System.out.print(ch);
            }
        }
    }
}
