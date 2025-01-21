package coding_bat.nasyikat.logic_1;

public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer == true){
            return temp >=60 && temp <= 100;
        }
        if (isSummer == false) {
            return  temp >=60 && temp <= 90;
        }
        return isSummer;
    }
}
