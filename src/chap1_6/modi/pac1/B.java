package chap1_6.modi.pac1;

// A 클래스와 같은 패키지 => default, public만 접근 가능, private은 불가
// 클래스에는 제한자를 2개만 붙일 수 있음 public, default
class B {

    // 생성자 public 있어도 더 큰 개념인 클래스가 default면 public이 무시됨
    public B() {
        A a = new A();
        new A(100);
//        new A(1.5);

        a.f1 = 10;
        a.f2 = 20;
//        a.f3 = 30;

        a.m1();
        a.m2();
//        a.m3();
    }
}
