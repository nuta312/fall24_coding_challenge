package coding_bat.aiperiishenbekkyzy.string_1;

public class hasBad {
    public boolean hasBad(String str) {
        if(str.equals("bad"))
            return true;
        else if(str.length()<=3)
            return false;
        else if(str.substring(0,3).equals("bad"))
            return true;
        else if(str.substring(1,4).equals("bad"))
            return true;
        else
            return false;
    }
}
