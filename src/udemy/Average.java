package udemy;

public class Average
{
    static float findAverage(int num)
    {   //base case
        if (num == 0) return 0;
        return (float)num / 2 + findAverage(num - 1);

    }
    public static void main(String[] args) {
        System.out.println(findAverage(5));
    }
}
