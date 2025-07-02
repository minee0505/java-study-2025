package chapter1_9.static_;

import static chapter1_9.static_.Count.*;
import static chapter1_9.static_.util.InputUtils.prompt;

public class Main {
    public static void main(String[] args) {

        m1();

        x = 100;

        // 원주율 : 샤프 계산기의 원주율, 삼성계산기의 원주율이나 다 똑같음.
        System.out.println(Math.PI);

        Count c1 = new Count();
//        c1.x++;
        x++;
        c1.y++;
        c1.m2();


        Count c2 = new Count();
//        c2.x++;
        x++;
        c2.y++;

        c2.y = 100;
        c2.x = 999;

        System.out.printf("c1.x: %d, c1.y: %d\n", c1.x, c1.y);
        System.out.printf("c2.x: %d, c2.y: %d\n", c2.x, c2.y);

        System.out.println("============");
        double result = Calculator.calCircleArea(5);
        System.out.println(result);

        Calculator sharpCalc = new Calculator();
        sharpCalc.customizeColor("노랑색");

        String age = prompt("너 나이 써봐");


    }
}
