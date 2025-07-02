package chap1_7.inherit.player;

/*
                       object
                        |
                      player
              /         |      \
            Warrior   Mage   Hunter
            |     \     |
      Berserker    warMage

*/



public class Main {
    public static void main(String[] args) {
        // 상속은 힙영역에 워리어 객체 먼저 생성되는게 아니라 슈퍼클래스(부모 객체 먼저 생성됨)
        // 부모 객체(player)안에 필드(닉네임, 레벨, hp, exp) 들어있음
        // 만약, 부모 객체가 저장되어 있는 힙 영역의 주소를 100번지라고 하면 스택에 저장되어 있는 워리어가 100번지를 들고 있는게 아님
        // 부모 객체 저장되고 나서 워리어 객체도 나중에 저장됨
        // 워리어 객체의 필드에는 (닉네임, 레벨, hp, exp) 안 들어있고 rage만 들어있음
        // 워리어 객체가 저장되어 있는 힙 영역의 주소를 200번지라고 하면 스택에 저장되어 있는 워리어가 200번지 가리키고 있음
        // 그러면 워리어는 어떻게 플레이어를 가리켜서 부모의 필드를 가져오냐?
        // 아래 질문하기 슈퍼가 자기의 부모의 주소를 저장하는 포인터 변수
        // rage 말고 super가 포인터로 링크하고 있음
        // super에 100번지를 저장해서 플레이어를 찾아감
        // 상속은 실제로 물려주는게 아니라 부모의 설계도를 다시 끄집어내서 새 객체를 만드는 것.
        // 힙 영역에 두 객체를 저장, 상속은 두 객체를 메모리에서 운영하고 있는 것




        Warrior warrior = new Warrior("주차왕파킹");
        Mage mage = new Mage("충격왕쇼킹");
        Hunter hunter = new Hunter("스티븐호킹");

        warrior.showStatus();
        warrior.attack();

        System.out.println("======================");

        mage.showStatus();
        mage.attack();
        System.out.println("======================");

        hunter.showStatus();
        hunter.attack();
        System.out.println("======================");

        mage.fireBall(warrior);
        mage.fireBall(hunter);
        mage.fireBall(new Mage("법사짱"));

    }
}
