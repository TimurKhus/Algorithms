public class HW9_14 {

    public int[] createArrayNegativeOnTheRight(int[] array) {
//{4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
        if (array.length > 0) {
            int[] arrayNew = new int[array.length];
            int count = array.length - 1;
            int j = 0;
            for (int i = 0; i < array.length;i++) {
                if (array[i] < 0) {
                    arrayNew[count] = array[i];
                    count--;
                }else {
                    arrayNew[j] = array[i];
                    j++;
                }
            }
            return arrayNew;
        }
        return new int[]{};
    }
}
