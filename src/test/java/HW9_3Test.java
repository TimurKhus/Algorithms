import org.junit.jupiter.api.*;

import java.net.Inet4Address;

import static org.junit.jupiter.api.Assertions.*;

class HW9_3Test {

    HW9_3 hw9_3 = new HW9_3();
    @Order(1)
    @Test
    public void sumArrayTestHappyPathPositive(){
        HW9_3 hw9_3 = new HW9_3();
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;
        //{-7, -3} → -10

        Assertions.assertEquals(expectedResult,hw9_3.sumArray(array));
    }
    @Order(2)
    @Test
    public void sumArrayTestHappyPathNegative(){
        HW9_3 hw9_3 = new HW9_3();
        int[] array = {-7, -3};
        int expectedResult = -10;

        Assertions.assertEquals(expectedResult,hw9_3.sumArray(array));
    }
    @Order(3)
    @Test
    public void sumArrayTestHappyPathNegativePositive(){
        HW9_3 hw9_3 = new HW9_3();
        int[] array = {-7, -3, 5, 6};
        int expectedResult = 1;

        Assertions.assertEquals(expectedResult,hw9_3.sumArray(array));
    }
    @Test
    public void sumArrayTestHappyPathZero(){
        HW9_3 hw9_3 = new HW9_3();
        int[] array = {0};
        int expectedResult = 0;

        Assertions.assertEquals(expectedResult,hw9_3.sumArray(array));
    }
    @Test
    public void sumArrayTestHappyPathNull(){
        HW9_3 hw9_3 = new HW9_3();
        int[] array = {};
        int expectedResult = Integer.MAX_VALUE;

        Assertions.assertEquals(expectedResult,hw9_3.sumArray(array));
    }
    @Test
    public void sumArrayTestHappyPathMoreThanMax(){
        HW9_3 hw9_3 = new HW9_3();
        int[] array = {2147483647, 2147483647,2147483647};
        int expectedResult = Integer.MAX_VALUE * 3;

        Assertions.assertEquals(expectedResult,hw9_3.sumArray(array));
    }
}