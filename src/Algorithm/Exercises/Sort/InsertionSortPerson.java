package Algorithm.Exercises.Sort;

import java.util.Arrays;

public class InsertionSortPerson {

    public static void sort(Person[] arr){

        int i;
        for(i = 1; i < arr.length; i++){

            int j;
            Person key = arr[i];
            for(j = i - 1; j >= 0; j--){
                if((key.name.compareTo(arr[j].name) < 0)){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = key;
        }


        for (Person person : arr) {
            System.out.println(person.name);
        }
    }
}
