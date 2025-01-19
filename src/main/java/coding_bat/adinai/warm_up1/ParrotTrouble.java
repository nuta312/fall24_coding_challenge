package coding_bat.adinai.warm_up1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }
}
