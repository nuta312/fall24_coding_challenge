package coding_bat.gulasal.warm_up1;

public class FrontBack {
    public String frontBack(String str) {
        if(str.length() > 1){
            return str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
        }else {
            return str;
        }

    }
}
