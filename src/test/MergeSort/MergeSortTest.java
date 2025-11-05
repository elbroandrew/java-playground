package test.MergeSort;

import Algorithm.Sort.MergeSort.MergeSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MergeSortTest {

    int[] arr = {7,2,5,9,4,12,76,34,87,45,32,11,23,54};
    int[] result = {2,4, 5,7,9,11,12,23,32,34,45,54,76,87};
    int[] actual = MergeSort.Sort(arr);

    @Test
    void TestMergeSort(){

        assertArrayEquals(result, actual);

    }

    @Test
    void TestMergeSortZero(){
        int[] zeroArr = {0};
        int[] result = {0};
        int[] actual = MergeSort.Sort(zeroArr);
        assertArrayEquals(result, actual);

    }

}
