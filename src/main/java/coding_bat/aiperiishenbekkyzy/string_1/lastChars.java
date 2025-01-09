package coding_bat.aiperiishenbekkyzy.string_1;

public class lastChars {
    public String lastChars(String a, String b) {
        if(a.length()<1 && b.length()<1)
            return "@@";
        else if(b.length()<=1)
            return a.substring(0,1)+"@";
        else if(a.length()<1)
            return "@"+b.substring(b.length()-1,b.length());
        else if(a.length()<=1)
            return a.substring(0,1)+b.substring(b.length()-1,b.length());
        else
            return a.substring(0,1)+b.substring(b.length()-1,b.length());
    }
}
