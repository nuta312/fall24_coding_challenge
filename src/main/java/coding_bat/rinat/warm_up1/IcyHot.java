package coding_bat.rinat.warm_up1;

public class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        if (temp1 > 100 && temp2 < 0){
            return true;
        } else if (temp2 > 100 && temp1 < 0) {
            return true;
        } else {
            return false;
        }
    }

}
