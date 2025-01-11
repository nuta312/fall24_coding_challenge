package coding_bat.rinat.String1;

public class MiddleTwo {
    public String middleTwo(String str) {
        if (str.length() < 3) {
            return str;
        }else {
            return str.substring(str.length()/2-1,str.length()/2+1);
        }
    }

}
