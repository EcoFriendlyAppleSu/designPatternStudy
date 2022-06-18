package mediatorPattern;

public class Client {
    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoomImpl();

        User1 user1 = new User1(chatRoom);
        user1.setName("Lee");
        user1.sendMessage("How are you?");

        User2 user2 = new User2(chatRoom);
        user2.setName("Kim");
        user2.sendMessage("I'm fine! ");
    }
}
