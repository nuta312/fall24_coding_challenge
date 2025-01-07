package coding_bat.gulasal.warm_up1;

public class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 0 && temp2 < 100);
    }
}
