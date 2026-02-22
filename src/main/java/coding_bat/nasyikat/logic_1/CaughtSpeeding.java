package coding_bat.nasyikat.logic_1;

public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int noTicketLimit;
        int smallTicketLimit;
        if (isBirthday) {
            noTicketLimit = 65;
            smallTicketLimit = 85;
        } else {
            noTicketLimit = 60;
            smallTicketLimit = 80;
        }
        if (speed <= noTicketLimit) {
            return 0;
        } else if (speed <= smallTicketLimit) {
            return 1;
        } else {
            return 2;
        }
    }
}
