package coding_bat.rano.warm_up1;

public class NearHundred {
    public boolean nearHundred(int n) {
        boolean ans = false;
        if (n + 10 >= 100 && n - 10 <= 100){
            ans = true;
        } else if (n + 10 >= 200 && n - 10 <=200){
            ans = true;
        }
        return ans;
    }
}
