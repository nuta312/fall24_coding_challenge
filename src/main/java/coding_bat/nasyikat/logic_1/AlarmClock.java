package coding_bat.nasyikat.logic_1;

public class AlarmClock {
    public String alarmClock(int day, boolean vacation) {
        if (vacation){ // true
            if (day >=1 && day <=5){
                return "10:00";
            }
            else {
                return "off";
            }
        }
        else { // false
            if (day >=1 && day <=5){
                return "7:00";
            }
            else {
                return "10:00";
            }
        }
    }
}
