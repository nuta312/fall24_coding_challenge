package coding_bat.rano.string2;

public class GetSandwich {
    public String getSandwich(String str) {
        int f = -1;
        int l = -1;
        for(int i=0; i < str.length()-4; i++) {
            if(str.substring(i,i+5).equals("bread")) {
                if(f==-1) {
                    f=i;
                }
                l=i;
            }
        }
        if( f == l) {
            return "";
        }
        return str.substring(f+5,l);
    }
}
