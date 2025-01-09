package coding_bat.gera.string1;

public class ExtraFront {
    public String extraFront(String str) {
        if (str.length() >= 2){
            String c = str.substring(0,2);
            return c+c+c;
        }
        else {
            return str+str+str;
        }
    }
}
