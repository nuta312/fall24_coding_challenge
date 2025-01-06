package coding_bat.rano.warm_up1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        return ((hour <7 || hour > 20) && talking);
    }
}
