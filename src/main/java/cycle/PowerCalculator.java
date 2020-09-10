package cycle;

public class PowerCalculator {


    public static int power(int number, int power) {
        int result = number;
        if (number > 0 && power > 0) {
            for (int i = 1; i < power; i++) {
                result *= number;
            }
        } else {
            System.out.println("Числа должны быть только положительные.");
            return 0;
        }
        return result;
    }
}

