package coding_bat.rinat.warm_up2;

public class StringBits {
    public String stringBits(String str) {
        String s="";
        for(int i=0;i<str.length();i++){
            s+=str.charAt(i);
            i++;
        }
        return s;
    }

}
