import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HW9_10Test {

    @Order(1)
    @Test
    public void testCheckPeakElementArrayHappyPathPositiveEightNumbers() {
        HW9_10 hw9_10 = new HW9_10();
        //{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        Assertions.assertArrayEquals(expectedResult, hw9_10.checkPeakElementArray(array));
    }
    @Order(1)
    @Test
    public void testCheckPeakElementArrayHappyPathPositiveNineNumbers() {
        HW9_10 hw9_10 = new HW9_10();
        //{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1, 45,2};
        int[] expectedResult = {3, 7, 23,45};

        Assertions.assertArrayEquals(expectedResult, hw9_10.checkPeakElementArray(array));
    }
}