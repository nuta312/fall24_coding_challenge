package coding_bat.begimai.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String last2char = "";
        if(str.length() >= 2){
            last2char = str.substring(str.length()-2,str.length());
        }
        return last2char+last2char+last2char;
    }
}
