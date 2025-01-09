package coding_bat.aidana.warm_up1.warmUp2;

public class stringTimes {
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;  // could use += here
        }
        return result;
    }
}
