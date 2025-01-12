package coding_bat.dastanA.warm_up1;

public class MixStart {
    public boolean mixStart(String str) {
        if(str.length()>2){
            if (str.substring(0, 2).equals("mix") || str.substring(1, 3).equals("ix")) {
                return true;
            }
        }
        return false;
    }
}
