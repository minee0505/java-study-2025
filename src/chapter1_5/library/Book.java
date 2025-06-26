package chapter1_5.library;

public class Book {
    int n1, n2, n3;

    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        System.out.println("1번 생성자!");
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book(String title) {
        this(title, "홍길동", 2025); // 나의 또다른 생성자를 호출!
        System.out.println("2번 생성자!");
//        this.title = title;
//        this.author = "홍길동";
//        this.year = 2025;
    }

    public Book(String title, String author) {
        this(title, author, 1999);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    void add(int n1, int n2, int n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    void add(int n1) {
        add(n1, 100, 200);
    }
}
