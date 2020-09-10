package cycle;

public class NumberService {

    public static int rangeSum(int start, int finish) {
        int sum = 0;
        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                sum += i;
            }
        }
        if (start > finish) {
            for (int i = finish; i <= start; i++) {
                sum += i;
            }
        }
        return sum;
    }

    public static int rangeEvenSum(int start, int finish) {
        int sum = 0;
        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }
        if (start > finish) {
            for (int i = finish; i <= start; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }

}

