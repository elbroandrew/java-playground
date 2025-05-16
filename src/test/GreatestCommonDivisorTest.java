import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void stringsAreEqualsReturn4(){
        String s1 = "LEET";
        String s2 = "CODE";
        assertEquals("", GreatestCommonDivisor.solve(s1 ,s2));
    }

    @Test
    void stringsNotEqualsReturn4(){
        String s1 = "ABABABAB";
        String s2 = "ABAB";
        assertEquals("ABAB", GreatestCommonDivisor.solve(s1 ,s2));
    }

    @Test
    void stringsNotEqualsReturn3(){
        String s1 = "ABCABC";
        String s2 = "ABC";
        assertEquals("ABC", GreatestCommonDivisor.solve(s1 ,s2));
    }

    @Test
    void stringsNotEqualsForTAUXX(){
        String s1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String s2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        assertEquals("TAUXX", GreatestCommonDivisor.solve(s1 ,s2));
    }

}