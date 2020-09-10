package cycle;

public class ForOddChecker {

    public static void printOdd() {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
