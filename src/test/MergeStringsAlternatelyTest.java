import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    @Test
    void solveTest() {
        String s1 = "ab";
        String s2 = "pqrs";
        assertEquals("apbqrs", MergeStringsAlternately.solve(s1 ,s2));
    }
}