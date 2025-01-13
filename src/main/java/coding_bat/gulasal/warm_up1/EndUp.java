package coding_bat.gulasal.warm_up1;

public class EndUp {
    public String endUp(String str) {
        int length = str.length();
        if( length >= 3) {
            return str.substring(0,length - 3) + str.substring(length-3, length).toUpperCase();
        } else {
            return str.toUpperCase();
        }
    }
}
