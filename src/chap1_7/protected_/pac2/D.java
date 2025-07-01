package chap1_7.protected_.pac2;

import chap1_7.protected_.pac1.A;

public class D extends A {

    // protected는 다른 패키지에 접근을 허용하지 않음
    // 상속관계가 있다면 부분적으로 생성자 내부 접근을 허용함.

    D() {
        super.f1 = 10;
//        super.f2 = 10;

        super.m1();
//        super.m2();

    }

    void test() {
        A a = new A();
//        a.f1 = 20;
//        a.f2 = 20;


    }
}
