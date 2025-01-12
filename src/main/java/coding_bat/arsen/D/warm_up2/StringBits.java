package coding_bat.arsen.D.warm_up2;

public class StringBits {
    public String stringBits(String str) {
        StringBuilder sb = new StringBuilder();
        for(int a=0;a<str.length();a+=2){
            sb.append(str.charAt(a));
        }
        return sb.toString();
    }
}
