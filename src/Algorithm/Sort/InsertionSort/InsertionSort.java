package Algorithm.Sort.InsertionSort;

import java.util.Arrays;

//Будто карты в руке сортирую. Беру одну с начала и сравниваю с оставшимися.
public class InsertionSort {

    public static int[] Do(int[] arr){

        for (int i = 1; i < arr.length; i++) { //перемещение по несортированной части справа-налево
            var key = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) { // перемещение по сортированной части слева-направо

                if(key < arr[j]){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
