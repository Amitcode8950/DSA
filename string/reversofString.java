public class reversofString {
    // Reverse the order of words in the input string while preserving spacing
    // between words.
    static String rever(String name) {
        StringBuilder ans = new StringBuilder();
        int i = name.length() - 1; // Start from the end of the string

        while (i >= 0) {
            // Skip trailing spaces between words
            while (i >= 0 && name.charAt(i) == ' ') {
                i--;
            }

            // If we reached the beginning, break out
            if (i < 0)
                break;

            int j = i;
            // Find the start of the current word
            while (j >= 0 && name.charAt(j) != ' ') {
                j--;
            }

            // Append the current word to the result
            ans.append(name.substring(j + 1, i + 1));

            // Skip spaces before the next word
            while (j >= 0 && name.charAt(j) == ' ') {
                j--;
            }

            // If there are more words, add a single space separator
            if (j >= 0) {
                ans.append(" ");
            }

            // Continue from the character before the next word
            i = j;
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        // Example input string
        String name = "i need sex";

        // Print the reversed word order
        System.out.println(rever(name));
    }
}
