package coding_bat.aiperiishenbekkyzy.string_1;

public class conCat {
    public String conCat(String a, String b) {
        if(b.length()<1)
            return a;
        else if(a.length()<1)
            return b;
        else if(a.substring(a.length()-1).equals(b.substring(0,1)))
            return a.substring(0,a.length()-1)+b.substring(0,b.length());
        else
            return a+b;
    }
}
