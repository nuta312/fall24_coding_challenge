package coding_bat.begayim.warm2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String word = "";
        for (int i = 0; i < n; i++){
            word = word + str;
        }
        return word;
    }
}
