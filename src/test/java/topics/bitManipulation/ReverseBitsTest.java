package topics.bitManipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseBitsTest {

    @Test
    void reverseTest() {
        int given = 43261596;
        int expected = 964176192;
        Assertions.assertEquals(expected, ReverseBits.reverse(given));
    }
}