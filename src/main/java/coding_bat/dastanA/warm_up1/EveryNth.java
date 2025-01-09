package coding_bat.dastanA.warm_up1;

public class EveryNth {
    public String everyNth(String str, int n) {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            word.append(str.charAt(i));
        }
        return word.toString();
    }
}
