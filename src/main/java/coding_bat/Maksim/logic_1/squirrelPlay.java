package coding_bat.Maksim.logic_1;

public class squirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        int upperLimit = isSummer ? 100 : 90;
        return temp >= 60 && temp <= upperLimit;
    }
}
