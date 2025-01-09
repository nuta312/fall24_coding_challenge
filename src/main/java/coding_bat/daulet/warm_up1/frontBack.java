package coding_bat.daulet.warm_up1;

public class frontBack {
    public String frontBack(String str) {
        if(str.length() < 2){
            return str;
        }
        String c = str.substring(0,1);
        String x = str.substring(str.length()-1);
        String n = str.substring(1);
        String m = n.substring(0,n.length()-1);
        return x + m + c;

    }
}
