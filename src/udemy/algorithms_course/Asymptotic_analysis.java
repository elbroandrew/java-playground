package udemy.algorithms_course;

public class Asymptotic_analysis
{
    static int f1(int[] a, int x) //O(n)
    {
        for(int i = 0; i < a.length; ++i)
        {
            if(a[i] == x)
            {
                return x;
            }
        }
        return -1;
    }


    public static void main(String[] args)
    {

    }

}
