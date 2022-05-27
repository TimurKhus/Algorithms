public class HW9_13 {
    public int createKthLargest(int[] array, int k) {
        if (array.length > 0 && k <= array.length && k > 0) {
            int tmp = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                    }
                }
            }
            return array[k - 1];
        }
        return Integer.MAX_VALUE;
    }
}
