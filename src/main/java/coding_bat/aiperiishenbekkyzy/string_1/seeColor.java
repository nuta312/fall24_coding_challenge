package coding_bat.aiperiishenbekkyzy.string_1;

public class seeColor {
    public String seeColor(String str) {
        if(str.length()<=2)
            return "";

        if(str.substring(0,3).equals("red"))
            return "red";
        else if(str.length() > 3 && str.substring(0,4).equals("blue"))
            return "blue";
        else
            return "";
    }
}
