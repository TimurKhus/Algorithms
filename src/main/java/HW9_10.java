public class HW9_10 {

    public int[] checkPeakElementArray(int[] array) {
        // {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

        if (array.length > 0) {
            if (array.length == 1) {
                int[] arrayNew = {array[0]};
                return arrayNew;
            }
            if (array.length > 1) {
                int[] arrayNew = new int[(int) ((Math.ceil((array.length - 2) / 3) + 1))];

                int count = 0;
                for (int i = 0; i < array.length; i++) {
                    if (i < 1) {
                        if (array[i] > array[i + 1]) {
                            arrayNew[count] = array[i];
                            count++;
                        } else {
                            arrayNew[count] = array[i + 1];
                            count++;
                        }
                    }
                    if (i > 1) {
                        arrayNew[count] = Math.max(Math.max(array[i], array[i + 1]), array[i + 2]);
                        count++;
                        i += 2;
                    }
                }
                return arrayNew;
            }
        }
        return new int[]{};
    }
}
