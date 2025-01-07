package coding_bat.arsen.D.warm_up2;

public class AltPairs {
    public String altPairs(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length();i=i+4){
            sb.append(str.charAt(i));
            if(!(i+1>str.length()-1)){
                sb.append(str.charAt(i+1));
            }}
        str = sb.toString();
        return str;
    }
}
