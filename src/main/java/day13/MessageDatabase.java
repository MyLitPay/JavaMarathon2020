package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message x : messages) {
            if (x.getSender().equals(u1) && x.getReceiver().equals(u2)) {
                System.out.println(u1 + ": " + x.getText());
            } else if (x.getSender().equals(u2) && x.getReceiver().equals(u1)) {
                System.out.println(u2 + ": " + x.getText());
            }
        }
    }
}
