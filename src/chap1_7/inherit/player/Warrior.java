package chap1_7.inherit.player;

// 부모로부터 기능과 속성을 물려받는 자식 클래스 (sub class)
// 상속은 IS A 관계 - 사자는 동물이다.  학생은 인간이다.  소나타는 자동차다.
public class Warrior extends Player {

    int rage; // 분노게이지




    public Warrior(String nickName) {
        super(nickName, 100);
        this.rage = 0;
    }

    // 오버라이딩: 부모가 물려준 메서드를 고쳐 쓰는 것
    // 규칙: 1. 부모의 시그니처(이름, 리턴타입, 파라미터)와 동일해야 함
    //      2. 접근 제어자는 more public

    @Override // 오버라이딩 룰을 위반했는지 체크
    public void showStatus() {
        super.showStatus();
        System.out.println("# 분노게이지: " + this.rage);
    }

    void dash() {
        System.out.printf("%s님이 돌진합니다.\n", this.nickName);
    }
}
