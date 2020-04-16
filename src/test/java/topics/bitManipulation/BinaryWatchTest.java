package topics.bitManipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

class BinaryWatchTest {

    @Test
    void testName() {
        int given = 1;
        List<String> expected = asList("1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32");
        List<String> actual = BinaryWatch.calculatePossibleTimes(given);

        Assertions.assertEquals(expected.size(), actual.size());
        assertThat(expected, containsInAnyOrder(actual.toArray()));
    }
}