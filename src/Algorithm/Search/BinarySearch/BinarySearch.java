package Algorithm.Search.BinarySearch;

public class BinarySearch {
    //USE SORTED ARRAY
    public static String Do(int[] sortedArray, int x){
        int n = sortedArray.length;
        int r = n;
        int p = 0;
        while (p <= r){
            int q = (r + p)/2;
            System.out.println(q);
            if(sortedArray[q] == x){
                return "found at index: " + q;
            } else if (sortedArray[q] > x) {
                r = q - 1;
            } else if (sortedArray[q] < x) {
                p = q + 1;
            }
        }
        return "not found";
    }
}
