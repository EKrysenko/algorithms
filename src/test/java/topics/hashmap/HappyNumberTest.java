package topics.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HappyNumberTest {

    @Test
    void isHappy() {
        HappyNumber happyNumber = new HappyNumber();
        assertTrue(happyNumber.isHappy(19));
    }

    @Test
    void isNotHappy() {
        HappyNumber happyNumber = new HappyNumber();
        assertFalse(happyNumber.isHappy(123));
    }
}