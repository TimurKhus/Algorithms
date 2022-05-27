import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class HW9_2Test {
    HW9_2 hw9_2 = new HW9_2();
    @Order(1)
    @Test
    public void oddIndicesHappyPathSixIndices(){
        int[] array = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult =  {590, 985, 68};

        Assertions.assertArrayEquals(expectedResult, hw9_2.oddIndices(array));
    }
    @Order(2)
    @Test
    public void oddIndicesHappyPathNineIndices(){
        int[] array = {-45, 590, 234, 985, 12, 68,1,7,-456};
        int [] expectedResult =  {590, 985, 68,7};

        Assertions.assertArrayEquals(expectedResult, hw9_2.oddIndices(array));
    }
    @Test
    public void oddIndicesHappyPathZeroIndices(){
        int[] array = {};
        int [] expectedResult =  {};

        Assertions.assertArrayEquals(expectedResult, hw9_2.oddIndices(array));
    }
    @Test
    public void oddIndicesHappyPathOneIndex(){
        int[] array = {6};
        int [] expectedResult =  {};

        Assertions.assertArrayEquals(expectedResult, hw9_2.oddIndices(array));
    }
}