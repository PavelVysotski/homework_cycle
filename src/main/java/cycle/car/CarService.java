package cycle.car;

public class CarService {

    public static void accelerate(Car testCar, int targetSpeed) {
        if (testCar.getCurrentSpeed() < targetSpeed) {
            for (int i = testCar.getCurrentSpeed(); i <= targetSpeed; i++) {
                testCar.setCurrentSpeed(i);
                if (testCar.getCurrentSpeed() > testCar.getMaxSpeed()) {
                    break;
                }
                System.out.println(testCar.getCurrentSpeed());
            }
        }
        if (targetSpeed < testCar.getCurrentSpeed()) {
            System.out.println("Заданная скорость меньше текущей.");
        }
    }

    public static void decelerate(Car testCar, int targetSpeed) {
        if (testCar.getCurrentSpeed() > targetSpeed) {
            for (int i = testCar.getCurrentSpeed(); i >= targetSpeed; i--) {
                testCar.setCurrentSpeed(i);
                if (testCar.getCurrentSpeed() < 0) {
                    break;
                }
                System.out.println(testCar.getCurrentSpeed());
            }
        }
        if (testCar.getCurrentSpeed() < targetSpeed) {
            System.out.println("Текущая скорость меньше заданной.");
        }
    }

    public static boolean isDriving(Car testCar) {
        if (testCar.getCurrentSpeed() > 0) {
            return true;
        }
        return false;
    }

    public static boolean isStopped(Car testCar) {
        if (testCar.getCurrentSpeed() == 0) {
            return true;
        }
        return false;
    }

    public static boolean canAccelerate(Car testCar) {
        if (testCar.getCurrentSpeed() < testCar.getMaxSpeed()) {
            return true;
        }
        return false;
    }
}
