public class HW9_15 {

    public static int[][] createSumOfTwo(int[] array, int sum) {
        //({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
        if (array.length > 0) {
            int count = 0;
            for (int i = 0;i < array.length;i++) {
                for (int j = i + 1;j < array.length;j++) {
                    if (array[i] + array[j] == sum) {
                        count++;
                    }
                }
            }
            int[][] arrayNew = new int[count][2];
            count = 0;
            for (int i = 0;i < array.length;i++) {
                for (int j = i + 1;j < array.length;j++) {
                    if (array[i] + array[j] == sum) {
                        arrayNew[count][0] = array[i];
                        arrayNew[count][1] = array[j];
                        count++;
                    }
                }
            }
            return arrayNew;
        }else {
            return new int[][]{};
        }
    }

}
