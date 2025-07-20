package Algorithm.Sort;

import java.util.Arrays;

public class SelectionSort {

    // O(n^2)

    public static void Do(int[] arr){

        int i = 0;
        int n = arr.length;
        while (i < n - 1){
            int minIndex = i;
            int j = i + 1;
            while (j < n){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }else{
                    j++;
                }
            }
            //Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
