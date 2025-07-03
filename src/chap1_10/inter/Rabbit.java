package chap1_10.inter;

// extends는 반드시 implements 앞에
public class Rabbit extends Animal implements Pet, Wild{

    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    @Override
    public void violent() {

    }
}
