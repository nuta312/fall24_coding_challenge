package coding_bat.aidai.warm_up2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        int front = 3;
        if (front > str.length()){
            front = str.length();
        }
        String front1 = str.substring(0,front);
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + front1;
        }
        return result;
    }
}
