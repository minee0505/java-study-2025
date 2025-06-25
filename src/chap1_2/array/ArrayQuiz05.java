package chap1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz05 {

    public static void main(String[] args) {

        String[] names = new String[]{};

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("오늘 만난 사람들 명단\n'그만' 입력하면 종료");

            String name = sc.nextLine();

            if (name.equals("그만")) break;

            String[] tempArr = new String[names.length + 1];

            for (int i = 0; i < names.length; i++) {
                tempArr[i] = names[i];
            }
            tempArr[tempArr.length - 1] = name;

            names = tempArr;

            tempArr = null;
        }
        System.out.println(Arrays.toString(names));
    }
}
