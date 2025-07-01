package chap1_6.modi.pac2;

import chap1_6.modi.pac1.A;

// A 클래스와 다른 패키지 => public만 접근 가능함
public class C {

    C() {
        A a = new A();
//        new A(10);
//        new A(1.2);

        a.f1 = 100;
//        a.f2 = 200;
//        a.f3 = 300;

        a.m1();
//        a.m2();
//        a.m3();

//        new B();
    }
}
