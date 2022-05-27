public class HW9_8 {
    //({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
    public int[] minMaxAve(int[] array, int startIndex, int endIndex) {
        if (array != null && array.length > 0 && startIndex >=0 && startIndex <= endIndex && endIndex < array.length) {
            //int[] result = new int[3];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            //if (startIndex <= endIndex) {
                for (int i = startIndex; i <= endIndex; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                    if (array[i] < min) {
                        min = array[i];
                    }
                    sum = sum + array[i];
                }
                return new int[]{min, max, (sum / (endIndex - startIndex + 1))};
            //} else if (startIndex > endIndex) {
//                for (int i = startIndex; i >= endIndex; i--) {
//                    if (array[i] > max) {
//                        max = array[i];
//                    }
//                    if (array[i] < min) {
//                        min = array[i];
//                    }
//                    sum = sum + array[i];
//                }
//                return new int[]{min, max, (sum / (startIndex - endIndex + 1))};
//            }
        } else {
            return new int[]{};
        }
    }
}
