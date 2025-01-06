package coding_bat.aiza.warm_up1;

public class backAround {
    public String backAround(String str) {
        char lastchar = str.charAt(str.length()-1);
        return lastchar + str + lastchar;
    }
}
