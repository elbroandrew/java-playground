package Algorithm.Exercises.SortedContactBook;

public class Comparator {

    public static int Do(String input, String target){
        int i = 0;
        while (i < input.length() && i < target.length()){
            char c1 = input.charAt(i);
            char c2 = target.charAt(i);
            if(c1 != c2){
                return c1 < c2 ? -1 : 1;
            }
            i++;
        }
        return Integer.compare(input.length(),target.length());
    }
}
