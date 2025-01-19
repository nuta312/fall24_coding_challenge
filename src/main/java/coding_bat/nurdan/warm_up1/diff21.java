package coding_bat.nurdan.warm_up1;

public class diff21 {
    public int dif21(int n) {
        if (n <= 21){
            int dif = 21 -n;
            return dif;
        } else if (n > 21){
            int dif2 = (n - 21) *2;
            return dif2;
        } else return 0;
    }
}
