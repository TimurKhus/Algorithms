import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HW9_13Test {
    @Order(1)
    @Test
    public void testCreateKthLargest(){
        HW9_13 hw9_13 = new HW9_13();
        int [] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        //{12, 12, 9, 7, 5, 4, 4, 3, 2}
        int k = 3;
        int expectedResult = 9;

        Assertions.assertEquals(expectedResult,hw9_13.createKthLargest(array,k));
    }
}