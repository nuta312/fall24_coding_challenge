package coding_bat.aiperiishenbekkyzy.string_1;

public class extraFront {
    public String extraFront(String str) {
        if(str.length()<1)
            return str;
        else if(str.length()==1)
            return str.substring(0,1)+str.substring(0,1)+str.substring(0,1);
        else
            return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
    }

}
