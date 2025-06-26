package chap1_3;

public class VehicleMain {

    public static void main(String[] args) {

        Vehicle grandeur = new Vehicle("현대", "그렌져"); // 기본 생성자 - 안만들어도 자바가 기본적으로 만들어줌
        Vehicle panamera = new Vehicle("포르쉐", "파나메라");

        System.out.println("grandeur = " + grandeur);
        System.out.println("panamera = " + panamera);
    }
}
