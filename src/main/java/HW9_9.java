public class HW9_9 {

    public int[] createIntersectionArrays(int[] array1, int[] array2) {
        //{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
        if (array1.length > 0 && array2.length > 0) {

            for (int i = 0; i < array1.length;i++) {
                for (int j = i + 1; j < array1.length;j++) {
                    if (array1[i] == array1[j]) {
                        array1[j] = Integer.MAX_VALUE;
                    }
                }
            }
            for (int i = 0; i < array2.length;i++) {
                for (int j = i + 1; j < array2.length;j++) {
                    if (array2[i] == array2[j]) {
                        array2[j] = Integer.MAX_VALUE;
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < array1.length;i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j] && array1[i] != Integer.MAX_VALUE && array2[j] != Integer.MAX_VALUE) {
                        count++;
                    }
                }
            }
            int[] arrayNew = new int[count];
            count = 0;
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j] && array1[i] != Integer.MAX_VALUE && array2[j] != Integer.MAX_VALUE) {
                        arrayNew[count] = array1[i];
                        count++;
                    }
                }
            }
            return arrayNew;
        } else {
            return new int[]{};
        }
}}
