import java.util.HashMap;

public class FindDuplicates {

//    int[] array = new int[6];
//        Arrays.setAll(array, i -> (int) (Math.random() * 10));
//        System.out.println(Arrays.toString(array));
//    int[] ar = sumRecursive(array);


static int[] findDuplicates(int[] arr) {
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(arr.length);
    for (Integer i : arr) {
        hm.put(i, hm.getOrDefault(i, 0) + 1);
    }
    System.out.println(hm);
    return arr;
    }
}

