package cycle;

public class DoWhileOddChecker {

    public static void printOdd() {
        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.print(i +", ");
            }
            i++;
        } while (i <= 50);
    }
}
