import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HW9_15Test {

    @Test
    public void testCreateSumOfTwoHappyPath() {
        //({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
        HW9_15 hw9_15 = new HW9_15();
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        Assertions.assertArrayEquals(expectedResult, hw9_15.createSumOfTwo(array,sum));
    }

}