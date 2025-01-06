package coding_bat.arsen.D.warm_up1;

public class BackAround {

    public String backAround(String str) {
        char c1 = str.charAt(str.length() - 1);
        return c1 + str + c1;
    }
}
