package coding_bat.arsen.D.warm_up2;

public class StringSplosion {
    public String stringSplosion(String str) {
        StringBuilder sb=new StringBuilder();
        for(int a=0;a<=str.length();a++){
            sb.append(str.substring(0,a));
        }
        return sb.toString();
    }
}
