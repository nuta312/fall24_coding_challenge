package coding_bat.arsen.D.string_1;

public class NTwice {

    public String nTwice(String str, int n) {
        String va = str.substring(0 , n);
        String ba = str.substring(str.length()-n);
        return va + ba;
    }
}
