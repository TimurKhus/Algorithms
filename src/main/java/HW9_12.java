import java.util.*;

public class HW9_12 {

    //{4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
    public int[] createSortArray(int[] array) {
        if (array.length > 0) {
            Arrays.sort(array);
            return array;
        }
        return new int[] {};
    }
}
