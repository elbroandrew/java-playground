package codewars;

//returns summation of all numbers: summation(4) => 1+2+3+4+5

public class Grasshopper {

    static int summation(int x)
    {
        //base case
        if (x == 0) return 0;

        return x + summation(x - 1);
    }

    public static void main(String[] args) {
        int y = summation(5);
        System.out.println(y);
    }
}
