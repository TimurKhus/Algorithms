import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HW9_14Test {

    @Order(1)
    @Test
    public void testCreateArrayNegativeOnTheRight() {
        //{4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
        HW9_14 hw9_14 = new HW9_14();
        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -2, -12, -3};

        Assertions.assertArrayEquals(expectedResult, hw9_14.createArrayNegativeOnTheRight(array));
    }
}