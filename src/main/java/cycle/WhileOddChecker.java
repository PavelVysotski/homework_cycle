package cycle;

public class WhileOddChecker {

    public static void printOdd() {
        int i = 0;
        while (i <= 50) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
            i++;
        }
    }
}
