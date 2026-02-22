package coding_bat.alia_warmup1.alia_logic_1;

public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday){
            if (speed>65 && speed<=85){
                return 1;
            } else if (speed>=86) {
                return 2;
            }else if (speed<=65) {
                return 0;
            }
        }
        if (speed >60 && speed<=80) {
            return 1;
        } else if (speed>=81) {
            return 2;
        }

        return 0;
    }

}
