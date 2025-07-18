package Algorithm.Sort;

import java.util.Arrays;

public class BubbleSort {

    public static void Do(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            var swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]){
                    //Swap
                    var tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= tmp;
                }
            }
            if (!swapped){
                System.out.println("Массив уже отсортирован.");
                return;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
