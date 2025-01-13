package coding_bat.aiperiishenbekkyzy.string_1;

public class frontAgain {
    public boolean frontAgain(String str) {
        if(str.length()<=1)
            return false;
        else if(str.length()<=2)
            return true;
        else if (str.substring(0,2).equals(str.substring(str.length()-2)))
            return true;
        else
            return false;
    }
}
