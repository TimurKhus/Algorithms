public class HW9_3 {
//    Test Data:
//    {0, 1, 2, 3, 4, 5} → 15
//    {-7, -3} → -10
    public int sumArray(int[] array) {
        if (array.length > 0) {
            int sum = 0;
            for (int i = 0; i < array.length;i++) {
                sum = sum + array[i];
            }

            return sum;
        }else {
            return Integer.MAX_VALUE;
        }
    }

}
