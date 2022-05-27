import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HW9_8Test {

    @Order(1)
    @Test
    public void testMinMaxAverageHappyPathPositive(){
//({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
        HW9_8 hw9_8 = new HW9_8();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int startIndex = 2;
        int endIndex = 6;
        int [] expectedResult = {3, 7, 5};

        Assertions.assertArrayEquals(expectedResult,hw9_8.minMaxAve(array,startIndex,endIndex));
    }
    @Order(2)
    @Test
    public void testMinMaxAverageHappyPathNegative(){
//({-1, -2, -3, -4, -5, -6, -7, -8}, 2, 6) →  {-7, -3, -5}
        HW9_8 hw9_8 = new HW9_8();
        int[] array = {-1, -2, -3, -4, -5, -6, -7, -8};
        int startIndex = 2;
        int endIndex = 6;
        int [] expectedResult = {-7, -3, -5};

        Assertions.assertArrayEquals(expectedResult,hw9_8.minMaxAve(array,startIndex,endIndex));
    }
    @Order(3)
    @Test
    public void testMinMaxAverageHappyPathNegativePositive(){

        HW9_8 hw9_8 = new HW9_8();
        int[] array = {-1, -2, -3, -4, 5, 6, 7, 8};
        int startIndex = 2;
        int endIndex = 7;
        int [] expectedResult = {-4, 8, 3};

        Assertions.assertArrayEquals(expectedResult,hw9_8.minMaxAve(array,startIndex,endIndex));
    }
    @Order(4)
    @Test
    public void testMinMaxAverageHappyPathOppositeIndices(){

        HW9_8 hw9_8 = new HW9_8();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int startIndex = 6;
        int endIndex = 2;
        int [] expectedResult = {3, 7, 5};

        Assertions.assertArrayEquals(expectedResult,hw9_8.minMaxAve(array,startIndex,endIndex));
    }
    @Test
    public void testMinMaxAverageHappyPathEqual(){
//({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
        HW9_8 hw9_8 = new HW9_8();
        int[] array = {8};
        int startIndex = 0;
        int endIndex = 0;
        int [] expectedResult = {8, 8, 8};

        Assertions.assertArrayEquals(expectedResult,hw9_8.minMaxAve(array,startIndex,endIndex));
    }
}