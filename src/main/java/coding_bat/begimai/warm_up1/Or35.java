package coding_bat.begimai.warm_up1;

public class Or35 {
    public boolean or35(int n) {
        if(n > 0 && n % 3 == 0  || n % 5 == 0){
            return true;
        }
        return false;
    }

}
