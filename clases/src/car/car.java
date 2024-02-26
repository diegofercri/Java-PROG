package car;
import java.util.Objects;

// Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program.

public class Car{
    private int speed;

    public Car() {
        speed = 0;
    }

    public String speed() {
        return ("El coche va a " + this.speed + " km/h");
    }

    public void fullThrottle() {
        this.speed = 120;
        System.out.println(speed());
    }
}