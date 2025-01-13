package coding_bat.begayim.logic1;

public class SpecialEleven {
    public boolean specialEleven(int n) {
        if ( n>=0 && (n % 11 == 0) || ((n-1)%11==0) ) {
            return true;
        }
        else{
            return false;
        }
    }
}
