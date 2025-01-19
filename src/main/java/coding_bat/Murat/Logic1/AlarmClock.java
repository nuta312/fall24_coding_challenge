package coding_bat.Murat.Logic1;

public class AlarmClock {
    public String alarmClock(int day, boolean vacation) {
        if (vacation == false) {
            if (day >= 1 && day <= 5) return "7:00";
        }
        if (vacation == false) {
            if (day == 0 || day == 6) return "10:00";
        }
        if (vacation == true) {
            if (day >= 1 && day <= 5) return "10:00";
        }
        if (vacation == true) {
            if (day == 0 || day == 6) return "off";
        }
        return "";
    }
}