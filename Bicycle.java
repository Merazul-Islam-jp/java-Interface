package Inheritance;

public class Bicycle {

    public int gear;
    public int speed;

    Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    void Break(int decrement) {
        speed = speed - decrement;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    public String toString() {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }

}
