package coding_bat.rinat.warm_up1;

public class FrontBack {
    public String frontBack(String str) {
        if (str.length() > 1){
            str.substring(1,str.length());
            return str.substring(str.length()-1,str.length()) +  str.substring(1,str.length()-1) + str.substring(0,1);
        } else {
            return str;
        }
    }

}
