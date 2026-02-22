package coding_bat.alia_warmup1.alia_logic_1;

public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp >=60 && temp<=90){
            return true;
        }if (temp>90 && temp<=100){
            return isSummer;
        }
        return false;
    }

}
