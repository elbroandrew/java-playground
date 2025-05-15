import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinSubarraySumTest {

    @Test
    void calcOutput2for7() {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        assertEquals(2, MinSubarraySum.calc(target, nums));
    }

    @Test
    void calcOutput0for11() {
        int target = 11;
        int[] nums = {1,1,1,1,1,1,1,1};
        assertEquals(0, MinSubarraySum.calc(target, nums));
    }

    @Test
    void calcOutput1for4() {
        int target = 4;
        int[] nums = {1,4,4};
        assertEquals(1, MinSubarraySum.calc(target, nums));
    }

    @Test
    void calcOutput3for11() {
        int target = 11;
        int[] nums = {1,2,3,4,5};
        assertEquals(3, MinSubarraySum.calc(target, nums));
    }
}