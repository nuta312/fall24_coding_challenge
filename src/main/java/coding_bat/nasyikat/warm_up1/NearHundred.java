package coding_bat.nasyikat.warm_up1;

public class NearHundred {
    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }
}
