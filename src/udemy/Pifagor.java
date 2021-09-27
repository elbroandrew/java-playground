package udemy;

public class Pifagor
{
    static void  hypotenuza(double a, double b)
    {
        double c = Math.sqrt((a*a) + (b*b)); //Math.pow(a, 2)

        System.out.println(c);
    }

    public static void main(String[] args)
    {
        hypotenuza(2, 3);
    }
}
