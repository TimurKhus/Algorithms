public class HW9_1 {

//    -345 →  “Odd”
//     0 →  “Even”
//     222222 →  “Even”
//     2147483647 + 1 →  “Undefined”

    public String oddEven(long number) {
        if (number < Integer.MAX_VALUE && number > Integer.MIN_VALUE) {
            if (number % 2 == 0) {
                return "Even";
            }else {
                return "Odd";
            }
        }else {
            return "Undefined";
        }
    }
}
