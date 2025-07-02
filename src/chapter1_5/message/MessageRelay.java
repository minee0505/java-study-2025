package chapter1_5.message;

public class MessageRelay {

    public void relay(Messenger sender, String message) {

        if (sender instanceof User) {
            sender.sendMessage(message);
        } else if (sender instanceof Admin) {
            sender.sendMessage(message);
        }
    }
}
