import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class HW9_6Test {
    @Order(1)
    @Test
    public void testAreEqualNumbersHappyPathPositiveEqual() {
//        -89, 89
//        Expected result: -1
//        89, -89
//        Expected result: 1
        HW9_6 hw9_6 = new HW9_6();
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        Assertions.assertEquals(expectedResult,hw9_6.areNumbersEqual(a,b));
    }
    @Order(2)
    @Test
    public void testAreEqualNumbersHappyPathNegativePositive() {

//        89, -89
//        Expected result: 1
        HW9_6 hw9_6 = new HW9_6();
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        Assertions.assertEquals(expectedResult,hw9_6.areNumbersEqual(a,b));
    }
    @Order(3)
    @Test
    public void testAreEqualNumbersHappyPathPositiveNegative() {

        HW9_6 hw9_6 = new HW9_6();
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        Assertions.assertEquals(expectedResult,hw9_6.areNumbersEqual(a,b));
    }
    @Test
    public void testAreEqualNumbersHappyPathNegativeNegative() {

        HW9_6 hw9_6 = new HW9_6();
        int a = -89;
        int b = -100;
        int expectedResult = 1;

        Assertions.assertEquals(expectedResult,hw9_6.areNumbersEqual(a,b));
    }
    @Test
    public void testAreEqualNumbersHappyPathPositivePositive() {

        HW9_6 hw9_6 = new HW9_6();
        int a = 89;
        int b = 100;
        int expectedResult = -1;

        Assertions.assertEquals(expectedResult,hw9_6.areNumbersEqual(a,b));
    }
}