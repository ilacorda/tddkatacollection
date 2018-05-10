import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFindOddIntegerInArray {

    private FindOddIntegerInArray findOddIntegerInArray;

    @Before
    public void setUpGlobal() {
        findOddIntegerInArray = new FindOddIntegerInArray();

    }

    @Test
    public void testHappyPathFindIntAppearsOddTimes() {

        assertEquals(2, findOddIntegerInArray.findIt(new int[]{5, 4, 3, 1}));
        assertEquals(5, findOddIntegerInArray.findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        assertEquals(5, findOddIntegerInArray.findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
        assertEquals(4, findOddIntegerInArray.findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));

    }

}
