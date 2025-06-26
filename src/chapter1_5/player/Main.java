
package chapter1_5.player;

public class Main {
    public static void main(String[] args) {

        chapter1_5.player.Player shocking = new chapter1_5.player.Player("충격왕쇼킹");
        chapter1_5.player.Player insulting = new chapter1_5.player.Player("욕설왕");

        System.out.println("shocking = " + shocking);
        System.out.println("insulting = " + insulting);

        shocking.attack(insulting);
        shocking.attack(shocking);
    }
}

