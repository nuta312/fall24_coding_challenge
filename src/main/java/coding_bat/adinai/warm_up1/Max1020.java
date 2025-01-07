package coding_bat.adinai.warm_up1;

public class Max1020 {
    public int max1020(int a, int b) {
        if ((a >= 10 && a <= 20) && (b >= 10 && b <=20)) {
            if (a > b){
                return a;
            }else{
                return b;
            }

        } if ((a >= 10 && a <= 20) && (b < 10 || b > 20)){
            return a;

        }else if ((b >= 10 && b <= 20) && (a < 10 || a > 20)){
            return b;
        }
        return 0;
    }
}
