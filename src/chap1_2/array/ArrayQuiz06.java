package chap1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz06 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String[] games = new String[]{};

        while (true) {
            System.out.println("하고 싶은 게임을 입력하세요.\n'그만'입력하면 종료");

            String game = sc.nextLine();

            if (game.equals("그만")) break;

            String[] tempArr = new String[games.length + 1];

            for (int i = 0; i < games.length; i++) {
                tempArr[i] = games[i];
            }
            tempArr[tempArr.length - 1] = game;

            games = tempArr;

            tempArr = null;
        }
        System.out.println(Arrays.toString(games));
    }
}
