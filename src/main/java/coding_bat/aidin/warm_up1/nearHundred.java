package coding_bat.aidin.warm_up1;

public class nearHundred {
    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));


    }
}
