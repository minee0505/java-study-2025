package chapter1_5.message;

public class User extends Messenger {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    void sendMessage(String message) {
        System.out.println("[사용자] "+name+": "+message);
    }


}
