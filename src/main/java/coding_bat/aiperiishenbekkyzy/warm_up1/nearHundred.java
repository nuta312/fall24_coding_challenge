package coding_bat.aiperiishenbekkyzy.warm_up1;

public class nearHundred {
    public boolean nearHundred(int n) {
        if(Math.abs(n-100)<=10 || Math.abs(n-200)<=10)
            return true;
        else
            return false;
    }
}
