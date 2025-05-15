public class MergeStringsAlternately {

    public static String solve(String word1, String word2){
        int p0 = 0;
        int p1 = 0;
        StringBuilder result = new StringBuilder();

        while (p0 < word1.length() || p1 < word2.length()) {
            if (p0 < word1.length()) {
                result.append(word1.charAt(p0));
                p0++;
            }
            if (p1 < word2.length()) {
                result.append(word2.charAt(p1));
                p1++;
            }
        }
        return result.toString();
    }
}
