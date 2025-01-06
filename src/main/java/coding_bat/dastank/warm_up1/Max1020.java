package coding_bat.dastank.warm_up1;

public class Max1020 {
    public int max1020(int a, int b) {
        if((a>=10&&a<=20)&&a>b){
            return a;
        }else if((b>=10&&b<=20)&&b>a){
            return b;
        }else if((a>=10&&a<=20)&& !(b>=10&&b<=20)){
            return a;
        }else if(!(a>=10&&a<=20)&&(b>=10&&b<=20)){
            return b;
        }else{
            return 0;
        }
    }
}
