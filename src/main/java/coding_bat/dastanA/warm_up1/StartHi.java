package coding_bat.dastanA.warm_up1;

public class StartHi {
    public boolean startHi(String str) {
        if (str.length() >= 2 && str.substring(0,2).equals("hi"))
            return true;
        return false;
    }
}
