package Basic_String;
public class Longest_Prefix {

    public static String longest_Prefix(String str[]) {
        if (str == null || str.length == 0) {
            return "";
        }

        // Take the first string as the initial prefix
        String prefix = str[0];

        // Traverse remaining strings
        for (int i = 1; i < str.length; i++) {
            String current = str[i];
            int j = 0;

            // Compare characters at the same index
            while (j < prefix.length() && j < current.length()) {
                if (prefix.charAt(j) != current.charAt(j)) {
                    break;
                }
                j++;
            }

            // Keep only the matching characters
            prefix = prefix.substring(0, j);

            // If no common prefix remains
            if (prefix.length() == 0) {
                return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String str[] = {"flower", "flow", "fly", "flight"};
        System.out.println("Longest Common Prefix: " + longest_Prefix(str));
    }
}