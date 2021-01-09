package day13;

public class Task1 {
    public static void main(String[] args) {
        User mike = new User("Mike");
        User tom = new User("Tom");
        User fred = new User("Fred");

        mike.sendMessage(tom, "Hi");
        mike.sendMessage(tom, "What's up");
        tom.sendMessage(mike, "Hello, Mike");
        tom.sendMessage(mike, "I'm fine");
        tom.sendMessage(mike, "Where is my car, dude?");
        fred.sendMessage(mike, "Aloha");
        fred.sendMessage(mike, "That was a good whiskey");
        fred.sendMessage(mike, "Thank you for advice");
        mike.sendMessage(fred, "Aloha, my friend");
        mike.sendMessage(fred, "I'm glad to hear this");
        mike.sendMessage(fred, "Have you any plans on weekend?");
        fred.sendMessage(mike, "Absolutely not");

        MessageDatabase.showDialog(mike, fred);
    }
}
