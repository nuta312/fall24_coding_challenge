package coding_bat.aiperiishenbekkyzy.string_2;

public class getSandwich {
    public String getSandwich(String str) {
        int iFirst = str.indexOf("bread");
        int iLast = str.lastIndexOf("bread");
        if(iFirst != -1 && iLast != -1 && iFirst != iLast)
            return str.substring(iFirst+5, iLast);
        return "";
    }
}
