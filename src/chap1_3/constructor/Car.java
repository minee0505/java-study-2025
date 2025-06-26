package chap1_3.constructor;

public class Car {
    int speed;

    Car(int carSpeed) {
        speed = carSpeed;
    }

    int accelerate(int increment) {
        speed += increment;
        return speed;
    }

    int brake(int decrement) {
        speed -= decrement;
        return speed;
    }

    void displaySpeed(){
        System.out.println("speed = " + speed);
    }

    public static void main(String[] args) {
        Car car = new Car(50);
        car.accelerate(60);
        car.brake(20);
        car.displaySpeed();
    }
}
