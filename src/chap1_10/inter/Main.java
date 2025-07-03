package chap1_10.inter;

public class Main {

    public static void main(String[] args) {
        Master master = new Master();
        master.letsHunt(new Cat());
        master.letsHunt(new Lion());
        master.letsPlay(new Cat());

    }
}
