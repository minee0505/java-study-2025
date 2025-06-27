package chapter1_5.player;

public class Player {

    String nickName; // 필드
    int level;
    int hp;

    // 생성자: 캐릭터가 태어날 때 가져야할 값들을 세팅
    Player(String nick) { // 매개변수 : 지역변수
//        this.nickName = nickName; // 앞에 this 붙이면 필드랑 파라미터 이름 같게 할 수 있음/ this 붙인건 필드, this 없는건 매개변수
        nickName = nick;
        level = 1;
        hp = 100;
    }

    // 자바의 모든 메서드는 첫번째 파라미터(this)가 생략되어있음, Player this
    // 다른 플레이어를 때릴 수 있는 기능
    void attack(Player targetPlayer) {

        if (this == targetPlayer) {
            System.out.println("스스로를 공격할 수는 없습니다.");
            return;
        }

        System.out.println("targetPlayer = " + targetPlayer);
        System.out.println("this = " + this);
        // 상대방의 체력이 10 감소
        targetPlayer.hp -= 10;
        // 백데미지로 내 체력도 5 감소
        this.hp -= 5;

        System.out.printf("%s님이 %s님을 때렸습니다.\n", this.nickName, targetPlayer.nickName);
        System.out.printf("공격자 남은체력: %d, 타겟남은체력: %d\n", this.hp, targetPlayer.hp);
    }
}
