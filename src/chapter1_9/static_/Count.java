package chapter1_9.static_;

public class Count {
    /*
        접근 제한자 (access modifier) - 클래스, 필드, 메서드, 생성자
        사용 제한자 (usage modifier)
         static - 필드, 메서드, 내부 클래스 (일반 클래스 x)
         final - 클래스, 필드, 메서드
         abstract - 클래스, 메서드
     */

    // static - 정적, 공유, 객체가 필요없음
    public static int x;    // 정적 필드      - 공유 필드
    public int y;           // 인스턴스 필드   - 객체에 묶인 필드

    // 정적 메서드 : 모든 객체가 공유하는 기능, 객체 생성 없이 호출 가능
    public static void m1() {
        System.out.println("static method call!");

        // static 메서드 내부에서는 this를 알 수 없음
//        System.out.println(this);
        // 인스턴스 필드에 접근 불가능
//      this.y =100;
        Count ccc = new Count();
        ccc.y = 100;

        // static 필드에만 접근 가능
        x = 100;

//        m2();
    }

    // 인스턴스 메서드 : 객체별로 따로따로 행동하는 기능, 호출 시 객체 생성이 필수
    public void m2() {
        System.out.println("instance method call!");
        System.out.println(this.y);

        // 인스턴스 메서드는 정적 메서드를 호출 가능
        m1();
    }

}
