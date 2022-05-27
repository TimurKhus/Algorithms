import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HW9_4Test {

    @Test
    public void biggerValueTestHappyPathPositive(){
        HW9_4 hw9_4 = new HW9_4();
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        Assertions.assertEquals(expectedResult,hw9_4.biggerValue(a,b));
    }
    @Test
    public void biggerValueTestHappyPathNegative(){
        HW9_4 hw9_4 = new HW9_4();
        int a = -3333;
        int b = -9999;
        int expectedResult = -3333;

        Assertions.assertEquals(expectedResult,hw9_4.biggerValue(a,b));
    }
    @Test
    public void biggerValueTestHappyPathPositiveNegative(){
        HW9_4 hw9_4 = new HW9_4();
        int a = 33;
        int b = -99;
        int expectedResult = 33;

        Assertions.assertEquals(expectedResult,hw9_4.biggerValue(a,b));
    }
    @Test
    public void biggerValueTestHappyPathEqualNumbers(){
        HW9_4 hw9_4 = new HW9_4();
        int a = 33;
        int b = 33;
        int expectedResult = 33;

        Assertions.assertEquals(expectedResult,hw9_4.biggerValue(a,b));
    }
    @Test
    public void biggerValueTestMoreThanMax(){
        HW9_4 hw9_4 = new HW9_4();
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE + 100;
        int expectedResult = Integer.MAX_VALUE + 100;

        Assertions.assertEquals(expectedResult,hw9_4.biggerValue(a,b));
    }
}