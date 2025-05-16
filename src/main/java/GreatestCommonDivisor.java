public class GreatestCommonDivisor {

    public static String solve(String s1 , String s2){
        // в случае 'LEET' and 'CODE'
        if (!(s1 + s2).equals(s2 + s1)) {
            return "";
        }
        //  нахожу наиБОЛЬШИЙ общий делитель, если знаем какое число меньше
        int gcd;
        int l1 = s1.length();
        int l2 = s2.length();


        while (l2 != 0) {
            int temp = l2;
            l2 = l1 % l2;
            l1 = temp;
        }

        gcd = l1;

        return s1.substring(0, gcd);
    }

}
