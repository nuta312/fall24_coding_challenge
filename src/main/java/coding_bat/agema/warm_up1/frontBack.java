package coding_bat.agema.warm_up1;

public class frontBack {
    public String frontBack(String str) {
        if(str.length() <= 1)
            return str;
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        return last + str.substring(1, str.length()-1) + first;
    }
}
