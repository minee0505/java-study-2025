package chap1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String[] books = new String[]{};
        
        while (true) {
            System.out.println("추천할 책을 입력해주세요\n'끝'을 입력하면 종료 ");
            
            String book = sc.nextLine();
            
            if (book.equals("끝")) break;
            
            String[] temp = new String[books.length + 1];

            for (int i = 0; i < books.length; i++) {
                temp[i] = books[i];
            }

            temp[temp.length - 1] = book;

            books = temp;

            temp = null;
        }
        System.out.println(Arrays.toString(books));
    }
}
