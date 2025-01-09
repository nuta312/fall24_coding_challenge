package coding_bat.gulasal.warm_up1;

public class Max1020 {
    public int max1020(int a, int b) {

        if (a>b) {
            if(a>=10 && a<=20) {
                return a;
            } else if (!(a>=10 && a<=20) && b>=10 && b<=20){
                return b;
            } else {
                return 0;
            }}
        else if (b>a) {
            if(b>=10 && b<=20) {
                return b;
            } else if (a>=10 && a<=20 && !(b>=10 && b<=20)){
                return a;
            } else {
                return 0;
            }} else {
            return 0;}
    }
}
