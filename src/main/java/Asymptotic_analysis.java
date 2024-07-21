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

    //1 цикл
    static void cycle_1(int n) //O(n)
    {
        for(int i = 0; i < n; ++i)
        {
            System.out.println(i);
        }
    }

    //2 цикла
    static void cycle_nm1(int n, int m) //O(max(n,m)) = O(n+m)
    {
        for(int i = 0; i < n; ++i)
        {
            System.out.println(i);
        }

        for(int i = 0; i < m; ++i)
        {
            System.out.println(i);
        }
    }

    static void cycle_nm2(int n, int m) //O(n*m)
    {
        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < m; ++j)
            {
                System.out.println(i + j);
            }
        }


    }

    //асимптотика в квадрате, если один n вложен в n
    static void cycle_n2(int n) //O(n^2)
    {
        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < n; ++j)
            {
                System.out.println(i + j);
            }
        }


    }

    static void cycle_n3(int n) //O(n^3)
    {
        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < n; ++j)
            {
                for(int k = 0; k < n; ++k)
                {
                    System.out.println(i + j + k);
                }
            }
        }
    }

    static void cycle_ij(int n) //
    {
        for(int i = 0; i < n; ++i)
        {
            for(int j = i; j < n; ++j) //n + (n - 1) + (n  - 2) + ... + 1 == n*(n+1)/2 == 1/2*(n^2+n) == O(n^2)
            {
                System.out.println(i + j);
            }
        }
    }

    static void cycle_n123(int n) //O(n^3 + n^2 + n) -- берем большее: n^3
    {
        for(int i = 0; i < n; ++i) //O(n)
        {
            System.out.println(i);
        }

        for(int i = 0; i < n; ++i) //O(n^2)
        {
            for(int j = 0; j < n; ++j)
            {
                System.out.println(i + j);
            }
        }
        for(int i = 0; i < n; ++i) //O(n^3)
        {
            for(int j = 0; j < n; ++j)
            {
                for(int k = 0; k < n; ++k)
                {
                    System.out.println(i + j + k);
                }
            }
        }
    }

    static void cycle_abc123(int a, int b, int c) //O(a + b^2 + c^3)
    {
        for(int i = 0; i < a; ++i) //O(a), a = 1000000000000
        {
            System.out.println(i);
        }

        for(int i = 0; i < b; ++i) //O(b^2), b = 100
        {
            for(int j = 0; j < b; ++j)
            {
                System.out.println(i + j);
            }
        }
        for(int i = 0; i < c; ++i) //O(c^3), c = 10
        {
            for(int j = 0; j < c; ++j)
            {
                for(int k = 0; k < c; ++k)
                {
                    System.out.println(i + j + k);
                }
            }
        }
    }

    static int cycle_log1(int a) //O(log(a))
    //на каждой итерации уменьшаем в 10 раз, кол-во цифр мож вычислить через log10(a)
    {
        int sum = 0;
        while (a != 0)
        {
            sum +=  a % 10;
            a /= 10;
        }
        return sum;
    }

    static int cycle_log2(int n) //O(n*log(n))
    {
        int sum = 0;
        for(int i = 0; i < n; ++i)
        {
            int a = i;
            while (a != 0)
            {
                sum +=  a % 10;
                a /= 10;
            }

        }
        return sum;
    }

    static void cycle_sqrt(int n) //O(sqrt(n))
    {
        for(int i = 0; i*i < n; ++i)
        {
            System.out.println(i);
        }
    }



    public static void main(String[] args)
    {

    }

}
