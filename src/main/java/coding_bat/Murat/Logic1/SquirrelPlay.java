package coding_bat.Murat.Logic1;

public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer == true && (temp >= 60 && temp <= 100)) return true;
        else if (isSummer == false && (temp >= 60 && temp <= 90)) return true;
        return false;
    }
}