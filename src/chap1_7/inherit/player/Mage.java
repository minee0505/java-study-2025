package chap1_7.inherit.player;

public class Mage extends Player {


    int mana; // 마력게이지


    public Mage(String nickName) {
        super(nickName, 40);
        this.mana = 100;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# 마력게이지: " + this.mana);
    }

    void fireBall(Player player) {

        System.out.printf("%s님이 파이어볼을 시전합니다.\n", this.nickName);

            /*파이어볼을 맞은 플레이어의 직업이 전사면 50의 데미지를 입혀라
            마법사면 60의 데미지
            사냥꾼이면 40의 데미지를 입혀주세요.

            만약 전사가 파이어볼을 맞으면 해당 전사는 돌진을 시전합니다.*/

        if (player instanceof Warrior ) {
            player.hp -= 50;
            System.out.printf("%s님 50데미지 입음\n", player.nickName);
//            ((Warrior) player).dash(this.nickName);
            ((Warrior) player).dash(this);
        } else if (player instanceof Mage) {
            player.hp -= 60;
            System.out.printf("%s님 60데미지 입음\n", player.nickName);

        } else if (player instanceof Hunter) {
            player.hp -= 40;
            System.out.printf("%s님 40데미지 입음\n", player.nickName);

        }


    }
}
