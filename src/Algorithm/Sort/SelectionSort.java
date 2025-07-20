package Algorithm.Sort;

import java.util.Arrays;

public class SelectionSort {

    // O(n^2)

    public static void Do(int[] arr){

        int i = 0;
        int n = arr.length;
//        boolean swapped;
        while (i < n - 1){
//            swapped = false;
            int minIndex = i;
            int j = i + 1;
            while (j < n){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
//                    swapped = true;
                }
                j++;
            }
            //Swap
//            if (swapped){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
//            }else{
//                System.out.println("массив уже отсортирован.");
//                break;
//            }

            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
