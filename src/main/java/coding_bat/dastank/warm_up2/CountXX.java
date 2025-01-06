package coding_bat.dastank.warm_up2;

public class CountXX {
    int countXX(String str) {
        int a = 0;
        for(int b =0;b<str.length()-1;b++){
            if(str.substring(b,b+2).contains("xx")){
                a++;
            }
        }
        return a;
    }
}
