import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    public int find(@NotNull String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        Map<Character, Integer> visited = new HashMap<>();
        while (right < s.length()) {
            var c = s.charAt(right);
            if (visited.containsKey(c)) {
                // Move left pointer to the right of the previous occurrence
                left = Math.max(left, visited.get(c) + 1);
            }

            visited.put(c, right);
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }

}
