package coding_bat.begayim.logic1;

public class NearTen {
    public boolean nearTen(int num) {
        if ((num%10==1) || (num%10==2) || (num%10==8) || (num%10==9) || (num%10==0)){
            return true;
        }
        else{
            return false;
        }
    }
}
