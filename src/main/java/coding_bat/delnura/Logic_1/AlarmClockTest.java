package coding_bat.delnura.Logic_1;

public class AlarmClockTest {
    public String alarmClock(int day, boolean vacation) {
        String early = "7:00";
        String late = "10:00";
        String off = "off";

        if (day == 0 || day == 6) {
            if (vacation) {
                return off;
            }
            return late;
        }
        else if (vacation) {
            return late;
        }
        return early;
    }


}
