package coding_bat.rinat.warm_up2;

public class StringSplosion {
    public String stringSplosion(String str) {
        int len = str.length();
        String s="";
        for(int i=0;i<len+1;i++){
            s+=str.substring(0,i);
        }
        return s;
    }

}
