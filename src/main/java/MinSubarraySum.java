
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
            if (sum >= target) {
                while (sum - nums[left] >= target) {
                    left++;
                    sum -= nums[left];
                }
                    min = Math.min(min, right - left + 1);

            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
