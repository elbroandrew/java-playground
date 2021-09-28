package different_stuff;

import java.util.Locale;

public class Palindrome
{
    static boolean isPalindrome(String s)
    {
        s = s.replace(" ", "").toLowerCase(Locale.ROOT);
        StringBuilder reversed = new StringBuilder();

        for(int i = s.length()-1; i >= 0; i -= 1)
        {
            reversed.append(s.charAt(i));

        }

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != reversed.charAt(i))
            {
                System.out.println("Not palindrome!");
                return false;
            }
        }
        System.out.println("Palindrome!");
        return true;
    }

    public static void main(String[] args)
    {
        isPalindrome("race Car");
    }
}
