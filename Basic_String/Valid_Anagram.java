package Basic_String;
import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (mapS.containsKey(ch)) {
                mapS.put(ch, mapS.get(ch) + 1);
            } else {
                mapS.put(ch, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (mapT.containsKey(ch)) {
                mapT.put(ch, mapT.get(ch) + 1);
            } else {
                mapT.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : mapS.entrySet()) {

            if (!mapT.containsKey(entry.getKey()) ||
                !mapT.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}