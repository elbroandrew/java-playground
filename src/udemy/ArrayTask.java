package udemy;

public class ArrayTask
{
    /*
    создать массив от 100 до 1000, затем второй массив в обрутную сторону первому вывести в for each второй массив
    */




    public static void main(String[] args) {
        int[] johan = new int[901];

        for(int i = 0; i <= 900; i += 1)
        {
            johan[i] = i + 100;
        }
        System.out.println(johan[0] + "\n" + johan[900]);

        int[] pohan = new int[johan.length];
        for(int j = 0; j <= johan.length - 1; j += 1)
        {
            pohan[j] = johan[johan.length - j - 1];
        }
        System.out.println(pohan[0]);
        System.out.println(pohan[900]);
    }
}
