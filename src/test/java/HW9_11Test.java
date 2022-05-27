import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HW9_11Test {

    @Order(1)
    @Test
    public void testCreateReverseArrayHappyPathPositiveFour() {
        HW9_11 hw9_11 = new HW9_11();
        //{2, 7, 3, 10} → {10, 3, 7, 2}
        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        Assertions.assertArrayEquals(expectedResult, hw9_11.createReverseArray(array));
    }
    @Order(1)
    @Test
    public void testCreateReverseArrayHappyPathPositiveTen() {
        HW9_11 hw9_11 = new HW9_11();
        //{2, 7, 3, 10} → {10, 3, 7, 2}
        int[] array = {2, 7, 3, 10,23,1,5,8888,0,32};
        int[] expectedResult = {32,0,8888,5,1,23,10, 3, 7, 2};

        Assertions.assertArrayEquals(expectedResult, hw9_11.createReverseArray(array));
    }
}