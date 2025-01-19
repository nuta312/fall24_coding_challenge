package coding_bat.aiperiishenbekkyzy.string_1;

public class middleThree {
    public String middleThree(String str) {
        if(str.length()<3)
            return "";
        if(str.length()==3)
            return str;
        int len = str.length();
        int len2 = str.length()/2;
        return str.substring(len2-1, len2+2);
    }
}
