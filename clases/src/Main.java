import car.Car;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.speed());
        myCar.fullThrottle();
    }
}