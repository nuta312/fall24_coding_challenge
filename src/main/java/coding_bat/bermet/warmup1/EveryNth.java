package coding_bat.bermet.warmup1;

public class EveryNth {
    public String everyNth(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i += n){

            result+= str.charAt(i);
        }
        return result;
    }
}
