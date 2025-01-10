package coding_bat.aidai.warm_up1;

public class BackGround {
    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
}
