package mediatorPattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatRoomImpl implements ChatRoom {

    /*
     * Get current date time
     * */
    DateFormat simpleDateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");
    Date date = new Date();

    @Override
    public void showMessage(String msg, Participant participant) {
        System.out.println(participant.getName() + "gets message: " + msg);
        System.out.println("\t\t\t" + "[" + simpleDateFormat.format(date).toString() + "]");
    }

} // End of the ChatRoomImpl
