package chap1_7.inherit.player;

public class Hunter extends Player {

    int concentrate; // 집중 게이지

    public Hunter(String nickName) {
        super(nickName, 60);
        this.concentrate = 100;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# 집중게이지: "+this.concentrate);
    }

    void multiArrow() {

    }
}
