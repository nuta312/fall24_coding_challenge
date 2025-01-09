package coding_bat.daulet.warm_up1;

public class backAround {
    public String backAround(String str) {
        String c = str.substring(str.length()-1);
        return c + str + c;
    }
}
