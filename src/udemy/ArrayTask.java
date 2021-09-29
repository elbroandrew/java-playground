package udemy;

public class ArrayTask
{
    /*
    создать массив от 100 до 1000, затем второй массив в обрутную сторону первому вывести в for each второй массив
    */


    public static void main(String[] args) {
        int[] johan = new int[100];
        int[] pohan = new int[johan.length];

        for(int i = 0, j = johan.length - 1; i < johan.length; i++, j--)
        {
            johan[i] = i * 10;
            pohan[i] = j * 10;
        }

        System.out.println(johan[0] + "\n" + johan[99]);
        System.out.println(pohan[0]);
        System.out.println(pohan[99]);
    }
}
