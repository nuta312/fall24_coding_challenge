package coding_bat.aiperiKasymova.warm_up1;

public class EndUp {
    public String endUp(String str) {
        if(str.length()< 3){
            return str.toUpperCase();
        }
        String start = str.substring(0, str.length() - 3);
        String end = str.substring(str.length() - 3);
        return start + end.toUpperCase();
    }
}
