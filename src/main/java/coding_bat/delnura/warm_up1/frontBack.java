package coding_bat.delnura.warm_up1;

public class frontBack {
    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1,str.length()-1);

        return str.charAt(str.length()-1) +mid + str.charAt(0);
    }
}
