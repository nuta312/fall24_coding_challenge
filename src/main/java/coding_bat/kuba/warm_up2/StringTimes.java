package coding_bat.kuba.warm_up2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;  // could use += here
        }
        return result;
    }
}
