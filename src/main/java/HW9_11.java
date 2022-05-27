public class HW9_11 {
    //{2, 7, 3, 10} → {10, 3, 7, 2}

    public int[] createReverseArray(int[] array) {
        if (array.length > 0) {
            int [] reverseArray = new int[array.length];
            int count = reverseArray.length-1;
            for (int i = 0;i < array.length;i++) {
                reverseArray[count] = array[i];
                count--;
            }
            return reverseArray;
        }
        return new int[]{};
    }
}
