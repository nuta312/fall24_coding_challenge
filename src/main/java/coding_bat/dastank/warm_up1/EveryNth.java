package coding_bat.dastank.warm_up1;

public class EveryNth {
    public String everyNth(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();){
            sb.append(str.charAt(i));
            i+=n;
        }return sb.toString();
    }
}
