package coding_bat.aidai.warm_up1;

public class BachAround {
    public String backAround(String str) {
        // Get the last char
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
}
