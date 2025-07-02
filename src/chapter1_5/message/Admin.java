package chapter1_5.message;

public class Admin extends Messenger {
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    void sendMessage(String message) {
        System.out.println("[관리자] "+name+": "+message);
    }
}
