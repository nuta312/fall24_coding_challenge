package coding_bat.alia_warmup1.alia_logic_1;

public class AlarmClock {
    public String alarmClock(int day, boolean vacation) {
        if (vacation){
            if (day>=1 && day<6){
                return "10:00";
            }
            return "off";
        }
        if (!vacation){
            if (day>=1 && day<6){
                return "7:00";
            }

        } return "10:00";
    }

}
