
public class MinSubarraySum {
    /* Sliding Window */
    
    public static int calc(int target, int[] nums){

        /* sum >= target */

        // O(N)

        int left = 0;
        int min = Integer.MAX_VALUE;  // чтобы 'Math.min' не '0' постоянно выдавал
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            if(nums[right] >= target){
                return 1;
            }
            while (sum >= target) {
                    min = Math.min(min, right - left + 1);
                    sum -= nums[left];
                    left++;

            }
        }
        System.gc();  // уменьшает потребление памяти !!
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
