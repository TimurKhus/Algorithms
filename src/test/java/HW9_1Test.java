import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class HW9_1Test {
    HW9_1 hw9_1 = new HW9_1();

    @Order(1)
    @Test
    public void testOddEvenHappyPathNegativeOdd(){
//    -345 →  “Odd”
//     0 →  “Even”
//     222222 →  “Even”
//     2147483647 + 1 →  “Undefined”
        int number = -345;
        String expectedResult = "Odd";
        String actualResult = hw9_1.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(2)
    @Test
    public void testOddEvenHappyPathZeroEven(){

        int number = 0;
        String expectedResult = "Even";
        String actualResult = hw9_1.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(3)
    @Test
    public void testOddEvenHappyPathPositiveEven(){

        int number = 222222;
        String expectedResult = "Even";
        String actualResult = hw9_1.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(4)
    @Test
    public void testOddEvenHappyPathMaxPlusOne(){

        long number = Integer.MAX_VALUE + 1;
        String expectedResult = "Undefined";
        String actualResult = hw9_1.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testOddEvenHappyPathMoreThanMax(){

        long number = Integer.MAX_VALUE + 3L;
        String expectedResult = "Undefined";
        String actualResult = hw9_1.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testOddEvenHappyPathMinMinusOne(){

        long number = Integer.MIN_VALUE - 1L;
        String expectedResult = "Undefined";
        String actualResult = hw9_1.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testOddEvenHappyPathMinMinusThree(){

        long number = Integer.MIN_VALUE - 3L;
        String expectedResult = "Undefined";
        String actualResult = hw9_1.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}