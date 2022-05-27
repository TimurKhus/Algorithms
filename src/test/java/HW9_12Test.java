import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HW9_12Test {

    @Order(1)
    @Test
    public void testCreateSortArrayHappyPath() {
        //{4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
        HW9_12 hw9_12 = new HW9_12();
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        Assertions.assertArrayEquals(expectedResult, hw9_12.createSortArray(array));
    }


}