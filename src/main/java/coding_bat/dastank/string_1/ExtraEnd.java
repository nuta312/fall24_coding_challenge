package coding_bat.dastank.string_1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String str1= str.substring(str.length()-2,str.length());
        return str1+str1+str1;
    }
}
