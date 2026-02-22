package coding_bat.aguKanybaeva.warm_up2;

public class stringBits {
    public String stringBits(String str) {
        if(str.length() < 1) {
            return str;
        }
        String s = "";
        for(int i=0; i <str.length(); i=i+2) {
            s = s + str.substring(i,i+1);
        }
        return s;
    }
}
