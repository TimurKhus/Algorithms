import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HW9_9Test {

    @Order(1)
    @Test
    public void testCreateIntersectionArraysHappyPathPositive() {
        HW9_9 hw9_9 = new HW9_9();
        //{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
        //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
        //{1, 2, 4, 5, 89}, {8, 9, 45} → {}
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Assertions.assertArrayEquals(expectedResult,hw9_9.createIntersectionArrays(array1,array2));
    }
    @Order(2)
    @Test
    public void testCreateIntersectionArraysHappyPathPositiveNegative() {
        HW9_9 hw9_9 = new HW9_9();
        //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
        //{1, 2, 4, 5, 89}, {8, 9, 45} → {}
        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        Assertions.assertArrayEquals(expectedResult,hw9_9.createIntersectionArrays(array1,array2));
    }
    @Order(3)
    @Test
    public void testCreateIntersectionArraysHappyPathNoIntersection() {
        HW9_9 hw9_9 = new HW9_9();
        //{1, 2, 4, 5, 89}, {8, 9, 45} → {}
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};
        int[] expectedResult = {};

        Assertions.assertArrayEquals(expectedResult,hw9_9.createIntersectionArrays(array1,array2));
    }
    @Order(3)
    @Test
    public void testCreateIntersectionArraysInvalidData() {
        HW9_9 hw9_9 = new HW9_9();
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {};
        int[] expectedResult = {};

        Assertions.assertArrayEquals(expectedResult,hw9_9.createIntersectionArrays(array1,array2));
    }
    @Test
    public void testCreateIntersectionArraysEqualData() {
        HW9_9 hw9_9 = new HW9_9();
        int[] array1 = {1, 1, 2, 2, 2,9};
        int[] array2 = {1,1,9,2,2,8};
        int[] expectedResult = {1,2,9};

        Assertions.assertArrayEquals(expectedResult,hw9_9.createIntersectionArrays(array1,array2));
    }
}