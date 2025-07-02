package chap1_8.poly.drive;

public class Main {

    public static void main(String[] args) {
        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();

        Mustang m1 = new Mustang();
        Mustang m2 = new Mustang();
        Mustang m3 = new Mustang();

        Car[] cars = {t1, t2, t3, m1, m2, m3, s1, s2, new Sonata()
        };

        for (Car car : cars) {
            car.accelerate();
        }

        Object[] arr = {1, "sds", false, new Sonata()};

        System.out.println("=======================");

        Driver heartping = new Driver("하츄핑");

        heartping.drive(m1);

        System.out.println("=======================");

        CarShop carShop = new CarShop();

        Car car1 = carShop.exportCar(3000);
        System.out.println("car1 = " + car1);
        if(car1 != null) car1.accelerate();

        System.out.println("=======================");

        Sonata car2 = (Sonata) carShop.exportCar(3000);
        car2.accelerate();
        car2.joinHyundaiMembership();

        cars[0] = car2;


    }


}
