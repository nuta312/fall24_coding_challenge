package coding_bat.aiperiishenbekkyzy.string_1;

public class twoChar {
    public String twoChar(String str, int index) {
        if(str.length()-1<=index || str.length()<=index ||index<=0)
            return str.substring(0,2);
        else
            return str.substring(index,index+2);
    }
}
