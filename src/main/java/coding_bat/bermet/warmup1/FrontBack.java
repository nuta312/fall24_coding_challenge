package coding_bat.bermet.warmup1;

public class FrontBack {
    public String frontBack(String str) {
        if (str.length() == 1 || str.length() == 0){
            return str;
        } else {
            return str = (str.substring(str.length() - 1, str.length())) +
                    str.substring(1,str.length()-1) + str.substring(0,1);
        }
    }
}
