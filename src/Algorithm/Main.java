package Algorithm;

import Algorithm.Exercises.Sort.InsertionSortPerson;
import Algorithm.Exercises.Sort.Person;
import Algorithm.Sort.SelectionSort;

public class Main {

    public static void main(String[] args) {

//        SelectionSort.Do(new int[]{3,1,2});
//        SelectionSort.Do(new int[]{1,2,3,4});

        Person[] arr = new Person[5];
        arr[0] = new Person("John", 26);
        arr[1] = new Person("Bob", 53);
        arr[2] = new Person("Andrew", 32);
        arr[3] = new Person("Stein", 44);
        arr[4] = new Person("Clive", 34);
        InsertionSortPerson.sort(arr);



    }
}
