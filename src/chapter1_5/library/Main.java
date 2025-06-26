package chapter1_5.library;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("해리포터", "조앤롤링", 2002);
        System.out.println(book1);

        System.out.println("===================");
        Book book2 = new Book("판지의 제왕");
        System.out.println(book2);
    }
}
