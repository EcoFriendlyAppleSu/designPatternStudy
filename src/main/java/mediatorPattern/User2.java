package mediatorPattern;

public class User2 extends Participant {

    private String name;
    private ChatRoom chatRoom;

    public User2(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    @Override
    public void sendMessage(String msg) {
        /*
        * param1 : 전달할 메세지
        * param2 : Participant를 상속받은 User2
        * */
        chatRoom.showMessage(msg,this);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
