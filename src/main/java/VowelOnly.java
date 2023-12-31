public class VowelOnly
{
    public static String vowelOnly(String input){
        String vowel = "aei";
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (vowel.contains(String.valueOf(c).toLowerCase())){
                sb.append(c);
            }

        }

        return sb.toString();
    }
}
