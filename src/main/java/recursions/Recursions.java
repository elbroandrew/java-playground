package recursions;

public class Recursions {

    /*
    существуют разневе типы рекурсий, одни из них хвостовая и головная (циферки печатаются в разном порядке от
    большего к меньшему и наоборот).
    В Скала хвостовая рекурсия оптимизируется компилятором.

     */

    public static void main(String[] args) {

        //TailRecursion tailRecursion = new TailRecursion();
        //tailRecursion.fun(30000);

//        NonTailRecursion nonTailRecursion = new NonTailRecursion();
//        nonTailRecursion.fun(20000);

        FactorialWithTailRecursion fc = new FactorialWithTailRecursion();
        int result = fc.fun(30);
        System.out.println(result);

    }
}


class TailRecursion {
    // tail recursion -- когда последним происходит вызов самой функции

    public int fun(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.println(n);
        return fun(n-1);
    }
}

class FactorialWithTailRecursion {

    public int fun(int n) {

        return Local.loop(n, 1);
    }

    static class Local {

        public static int loop(int x, int accumulator) {
            if (x <= 1) {
                return accumulator;
            }
            else {
                return loop(x-1, x*accumulator);
            }
        }

    }

}


class NonTailRecursion {

    public void fun(int n) {
        if (n == 0) {
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
}