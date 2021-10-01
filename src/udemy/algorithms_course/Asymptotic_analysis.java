package udemy.algorithms_course;

public class Asymptotic_analysis
{
    static int search(int[] a, int x) //O(n)
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

    static void swap(int a, int b) //O(1) -- всегда три действия делает алгоритм.
    {
        int t = a;
        a = b;
        b = t;
    }


    public static void main(String[] args)
    {

    }

}
