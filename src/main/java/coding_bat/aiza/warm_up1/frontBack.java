package coding_bat.aiza.warm_up1;

public class frontBack {
    public String frontBack(String str) {
        if (str.length() <= 1){
            return str;
        }
        return str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
    }
}
