package cycle;

public class PrimeNumbers {

    public static int printPrimeSum() {
        int sum = 0;
        int countPrime = 0;
        for (int i = 2; i <= 500; i++) {
            int countDivide = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    countDivide++;
                }
            }
            if (countDivide < 2 && i != 17 && i != 71) {
                countPrime++;
                sum += i;
                System.out.print(i + ", ");
                if (countPrime == 50) {
                    break;
                }
            }
        }
        return sum;
    }
}


