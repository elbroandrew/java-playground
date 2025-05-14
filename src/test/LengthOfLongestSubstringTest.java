import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubstringTest {



    private LengthOfLongestSubstring ls = new LengthOfLongestSubstring();

    @Test
    void answerIsPositiveInt(){
        var s = "aaa";
        assertTrue(ls.find(s) > 0);
    }

    @Test
    void returns3forDVDF(){
        var s = "dvdf";
        assertEquals(3, ls.find(s));
    }

    @Test
    void returns4forABCABCD(){
        var s = "abcabcd";
        assertEquals(4, ls.find(s));

    }

    @Test
    void returns1forBBBB(){
        var s = "bbbb";
        assertEquals(1, ls.find(s));
    }

    @Test
    void returns3forPWWKEW(){
        var s = "pwwkew";
        assertEquals(3, ls.find(s));

    }

    @Test
    void returns3forCKILBKD(){
        var s = "ckilbkd";
        assertEquals(5, ls.find(s));

    }

    @Test
    void returns3forTMMZUXT(){
        var s = "tmmzuxt";
        assertEquals(5, ls.find(s));

    }

}