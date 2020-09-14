package cycle;

import cycle.car.Car;
import cycle.car.CarService;

public class App {
    public static void main(String[] args) {

//        System.out.println("Реализация for:");
//        ForOddChecker.printOdd();

//        System.out.println("\nРеализация while:");
//        WhileOddChecker.printOdd();

//        System.out.println("\nРеализация doWhile:");
//        DoWhileOddChecker.printOdd();

        System.out.println("\nРеализация суммы первых 50 простых чисел: ");
        System.out.println("\nСумма равна: " + PrimeNumbers.printPrimeSum());

//        System.out.println("Реализация суммы чисел в диапазоне: ");
//        int start = 0;
//        int finish = 10;
//        System.out.println(NumberService.rangeSum(start, finish));
//        System.out.println("Сумма четных чисел в диапазоне: ");
//        System.out.println(NumberService.rangeEvenSum(start, finish));

        Car testCar = new Car("Volvo", "black", 220, 60);
//        CarService.accelerate(testCar, 80);
//        CarService.decelerate(testCar, -10);
//        System.out.println(CarService.isDriving(testCar));
//        System.out.println(CarService.isStopped(testCar));
//        System.out.println(CarService.canAccelerate(testCar));
        int number = 5;
        int power = 3;
//        System.out.println(PowerCalculator.power(number, power));
    }

}
