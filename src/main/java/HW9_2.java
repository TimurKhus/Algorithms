public class HW9_2 {

//    Test Data:
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}
    public int[] oddIndices(int[] array) {
        if (array.length > 1) {
            int[] oddArray = new int[(int)array.length/2];
            for (int i = 1,j = 0; i < array.length;i+=2){
                oddArray[j] = array[i];
                j++;
            }
            return oddArray;
        }else {
            return new int[]{};
        }
    }


}
