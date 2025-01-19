package coding_bat.aiza.logic_1;

public class alarmClock {
    public String alarmClock(int day, boolean vacation) {
        boolean isWeekday = (day >= 1 && day <= 5);
        if (isWeekday) {
            return vacation ? "10:00" : "7:00";
        } else {
            return vacation ? "off" : "10:00";
        }
    }
}
