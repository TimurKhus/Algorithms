import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class HW9_5Test {

    @Order(1)
    @Test
    public void testIsPositiveNumberHappyPathPositive() {
        HW9_5 hw9_5 = new HW9_5();
      //555, 0 и -555.
        int a = 555;
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult,hw9_5.isPositiveNumber(a));
    }
    @Order(2)
    @Test
    public void testIsPositiveNumberHappyPathZero() {
        HW9_5 hw9_5 = new HW9_5();
        //555, 0 и -555.
        int a = 0;
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult,hw9_5.isPositiveNumber(a));
    }
    @Order(3)
    @Test
    public void testIsPositiveNumberHappyPathNegative() {
        HW9_5 hw9_5 = new HW9_5();
        //555, 0 и -555.
        int a = -555;
        boolean expectedResult = false;

        Assertions.assertEquals(expectedResult,hw9_5.isPositiveNumber(a));
    }
    @Test
    public void testIsPositiveNumberMax() {
        HW9_5 hw9_5 = new HW9_5();
        //555, 0 и -555.
        int a = Integer.MAX_VALUE;
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult,hw9_5.isPositiveNumber(a));
    }
    @Test
    public void testIsPositiveNumberMin() {
        HW9_5 hw9_5 = new HW9_5();
        //555, 0 и -555.
        int a = Integer.MIN_VALUE;
        boolean expectedResult = false;

        Assertions.assertEquals(expectedResult,hw9_5.isPositiveNumber(a));
    }
    @Test
    public void testIsPositiveNumberMaxPlusOne() {
        HW9_5 hw9_5 = new HW9_5();
        //555, 0 и -555.
        int a = Integer.MAX_VALUE + 1;
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult,hw9_5.isPositiveNumber(a));
    }
}