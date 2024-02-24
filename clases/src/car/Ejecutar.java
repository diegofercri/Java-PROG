package car;

public class Ejecutar {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.speed());
        myCar.fullThrottle();
    }
}
