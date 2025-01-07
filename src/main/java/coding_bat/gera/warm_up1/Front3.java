package coding_bat.gera.warm_up1;

public class Front3 {
    public String front3(String str) {
        String word;
        if (str.length() >= 3) {
            word = str.substring(0,3);
        } else {
            word = str;
        } return  word + word +word;

    }
}
