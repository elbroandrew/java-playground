package javarush;

public class ParseDoubleSolution
{
    public static void main(String[] args)
    {
        String string = "12.84";
        double x = Double.parseDouble(string);
        int rounded = (int) Math.round(x);

        System.out.println(rounded);

    }
}
