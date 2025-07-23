package Algorithm;


import Algorithm.Exercises.PhonebookSearch.ArrayList;
import Algorithm.Search.BinarySearch.BinarySearch;
import Algorithm.Sort.InsertionSort;
import Algorithm.Sort.SelectionSort;
import Algorithm.Utils.Stopwatch;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{7,9,1,4,8,3,2,5,8,9,11,34,53,234,63,567,68,34,52,24,78};
//        Stopwatch.start();
//        SelectionSort.Do(arr); //0.85  0.91  1.03
//        Stopwatch.stop();
//        Stopwatch.reset();
//        Stopwatch.start();
//        InsertionSort.Do(arr); // 0.52  0.54  0.64
//        Stopwatch.stop();
//        Stopwatch.reset();
//        int[] sortedArray = InsertionSort.Do(arr);
//        var result = BinarySearch.Do(sortedArray, 234);
//        System.out.println(result);
        ArrayList a = new ArrayList();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("d");
        a.add("d");
        a.add("d");
        for(int i = 0; i < a.len();i++){
            System.out.println(a.get(i));
        }


    }
}
