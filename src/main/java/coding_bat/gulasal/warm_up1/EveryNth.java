package coding_bat.gulasal.warm_up1;

public class EveryNth {
    public String everyNth(String str, int n) {
        String word = "";

        for (int i=0; i<str.length(); i = i + n) {
            word = word + str.charAt(i);
        }
        return word;
    }

}
