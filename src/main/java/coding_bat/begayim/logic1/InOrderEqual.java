package coding_bat.begayim.logic1;

public class InOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk){
            return a<=b && b<=c && a<=c;
        }
        else {
            return a<b && b<c;
        }
    }
}
