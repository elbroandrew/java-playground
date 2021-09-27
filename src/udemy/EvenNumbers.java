package udemy;

//use while loop
public class EvenNumbers
{
    public static void main(String[] args) {
        int i = 0;
        while (i < 30)
        {
            i++;
            if(i % 2 != 0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
