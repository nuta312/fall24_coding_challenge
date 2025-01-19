package coding_bat.aiperiishenbekkyzy.logic_1;

public class lastDigit {
    public boolean lastDigit(int a, int b, int c) {
        int aD = a % 10;
        int bD = b % 10;
        int cD = c % 10;
        if(aD == bD)
            return true;
        if(aD == cD)
            return true;
        return (bD == cD);
    }

}
