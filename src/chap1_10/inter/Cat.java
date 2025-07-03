package chap1_10.inter;

public class Cat extends Animal implements Pet, Huntable{

    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    @Override
    public void hunt() {

    }
}
