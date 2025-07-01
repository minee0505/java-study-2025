package chap1_7.gisa;

public class Parent {
    public String nation;

    public Parent() {
        this("대한민국");
        System.out.println("Parent() call!"); // 2
    }
    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parent(String) call!"); // 1
    }
}