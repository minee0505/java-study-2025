package chapter1_9.static_;

public class Calculator {

    String color;  // 계산기의 색상
    static double pi;     // 원주율

    // 계산기의 색깔을 변경하는 메서드
    // this 필요한 애한테는 static 붙이면 안됨
    void customizeColor(String newColor) {
        this.color = newColor;
    }

    // 반지름을 알려주면 원의 넓이를 구해주는 메서드
    static double calCircleArea(double r) {
        return pi * r * r;
    }

}
