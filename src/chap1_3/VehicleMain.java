package chap1_3;

public class VehicleMain {

    public static void main(String[] args) {

        // new를 쓰는 순간 힙 영역에 vehicle 객체 하나 생성, 주소값이 부여됨
        // 그 주소값을 스택에서 그랜져라는 변수가 저장하고 있음, 포인터로 힙의 vehicle을 가리키고 있음

        Vehicle grandeur = new Vehicle("현대", "그렌져"); // 기본 생성자 - 안만들어도 자바가 기본적으로 만들어줌
        Vehicle panamera = new Vehicle("포르쉐", "파나메라");

        System.out.println("grandeur = " + grandeur);
        System.out.println("panamera = " + panamera);
    }
}
