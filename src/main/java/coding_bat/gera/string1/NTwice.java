package coding_bat.gera.string1;

public class NTwice {
    public String nTwice(String str, int n) {
        if (str.length() >= n){
            return str.substring(0,n) + str.substring(str.length()-n);
        }
        else {
            return "";
        }
    }
}
