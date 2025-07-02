package chap1_7.inherit.player;

// 일반화: 상속을 위해 공통 속성과 공통 기능을 가진 부모 클래스 (super class)
public class Player extends Object {

    String nickName;
    int level;
    int hp;
    int exp;

//    public Player() {
//        System.out.println("플레이어의 생성자 호출!");
//    }

    public Player(String nickName, int hp) {
        this.nickName = nickName;
        this.level = 1;
        this.hp = hp;
    }

    void attack() {
        System.out.printf("%s님이 공격합니다.\n", this.nickName);
    }

    // 부모가 default로 물려줬으면 자식은 public, default, protected로 해야지, private으로 하면 안됨
    public void showStatus() {
        System.out.println("\n======= 플레이어 정보 =======");
        System.out.println("# 닉네임: " + this.nickName);
        System.out.println("# 레벨: " + this.level);
        System.out.println("# 체력: " + this.hp);
        System.out.println("# 경험치: " + this.exp);
    }

}
