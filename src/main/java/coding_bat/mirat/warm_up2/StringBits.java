package coding_bat.mirat.warm_up2;

public class StringBits {
    public String stringBits(String str) {
        String result = "";
        for (int i=0; i<str.length(); i+=2) {
            result = result + str.substring(i, i+1);
        }
        return result;
    }

}
