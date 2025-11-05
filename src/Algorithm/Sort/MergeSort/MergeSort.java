package Algorithm.Sort.MergeSort;

public class MergeSort {
//    - Разделяем массив пополам до тех пор, пока не получим массивы из одного элемента
//    - Рекурсивно сортируем левую и правую части
//    - Объединяем отсортированные части в один отсортированный массив
//
//    Временная сложность: O(n log n)
//    Пространственная сложность: O(n)

    public static int[] Merge(int[] sortedLeft, int[] sortedRight){
        int[] result = new int[sortedLeft.length + sortedRight.length];
        int i = 0;
        int j = 0;
        int k = 0;  // для индексов result
        while (i < sortedLeft.length && j < sortedRight.length){

            if(sortedLeft[i]< sortedRight[j]){
                result[k] = sortedLeft[i];
                i++;
                k++;
            }else{
                result[k] = sortedRight[j];
                j++;
                k++;
            }
        }
        //добавляю остатки
        while (i < sortedLeft.length){
            result[k] = sortedLeft[i];
            i++;
            k++;
        }
        while (j < sortedRight.length){
            result[k] = sortedRight[j];
            j++;
            k++;
        }
        return result;
    }


    public static int[] Sort(int[] arr){
        if (arr.length <= 1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        for(int i = 0; i < mid; i++){
            left[i] = arr[i];

        }
        int[] right = new int[arr.length - mid];
        for(int i = 0; i < arr.length-mid; i++){
            right[i] = arr[mid+i];
        }
        return Merge(Sort(left), Sort(right));

    }

}
