package coding_bat.aiperiKasymova.warm_up1;

public class EveryNth {
    public String everyNth(String str, int n) {
        String result = "";
        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
