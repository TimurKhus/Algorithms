import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class HW9_7Test {

    @Order(1)
    @Test
    public void testCheckNumberHappyPathMultipleOfThreeAndFive() {
//  	If M is multiple of 3 and 5 then return "Good Number".
//   	If M is only multiple of 3 and not of 5 then return "Bad Number"
//   	If M is only multiple of 5 and not of 3 then return "Poor Number"
//    	If M doesn't satisfy any of the above conditions then return "-1"

        HW9_7 hw9_7 = new HW9_7();
        int m = 15;
        String expectedResult = "Good Number";

        Assertions.assertEquals(expectedResult,hw9_7.checkNumber(m));
    }
    @Order(2)
    @Test
    public void testCheckNumberHappyPathMultipleOfThreeNotFive() {
//   	If M is only multiple of 3 and not of 5 then return "Bad Number"
//   	If M is only multiple of 5 and not of 3 then return "Poor Number"
//    	If M doesn't satisfy any of the above conditions then return "-1"

        HW9_7 hw9_7 = new HW9_7();
        int m = 9;
        String expectedResult = "Bad Number";

        Assertions.assertEquals(expectedResult,hw9_7.checkNumber(m));
    }
    @Order(3)
    @Test
    public void testCheckNumberHappyPathMultipleOfFiveNotThree() {
//   	If M is only multiple of 5 and not of 3 then return "Poor Number"
//    	If M doesn't satisfy any of the above conditions then return "-1"

        HW9_7 hw9_7 = new HW9_7();
        int m = 10;
        String expectedResult = "Poor Number";

        Assertions.assertEquals(expectedResult,hw9_7.checkNumber(m));
    }
    @Order(4)
    @Test
    public void testCheckNumberHappyPathNotMultipleOfFiveAndNotThree() {
//    	If M doesn't satisfy any of the above conditions then return "-1"

        HW9_7 hw9_7 = new HW9_7();
        int m = 11;
        String expectedResult = "-1";

        Assertions.assertEquals(expectedResult,hw9_7.checkNumber(m));
    }
}