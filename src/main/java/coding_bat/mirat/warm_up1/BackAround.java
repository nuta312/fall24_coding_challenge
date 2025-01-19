package coding_bat.mirat.warm_up1;

public class BackAround {
    public String backAround(String str) {
        // Get the last char
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
}
