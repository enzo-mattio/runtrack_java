package Job2;

public class Voiture {
    static int speed;
    public static void main(String[] args) {
        car_start();
        car_accelerate();
        car_accelerate();
        car_stop();
    }
    private static void car_start() {
        System.out.println("Car started!");
    }
    private static void car_accelerate() {
        speed += 10;
        System.out.println("Car accelerated! his speed is now: " + speed);
    }
    private static void car_stop() {
        System.out.println("Car stopped!");
    }

}
