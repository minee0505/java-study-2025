package chap1_7.inherit.player;

// 부모로부터 기능과 속성을 물려받는 자식 클래스 (sub class)
// 상속은 IS A 관계 - 사자는 동물이다.  학생은 인간이다.  소나타는 자동차다.
public class Warrior extends Player {

    int rage; // 분노게이지

    public Warrior(String nickName) {
        super(nickName, 100);
        this.rage = 0;
    }


    void dash() {
        System.out.printf("%s님이 돌진합니다.\n", this.nickName);
    }
}
