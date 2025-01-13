package coding_bat.bermet.string1;

public class Left2 {
    public String left2(String str) {
        String result = "";
        String end;
        if (str.length() <= 2){
            return str;
        }
        else{
            end = str.substring(0,2);
            result = str.substring(2,str.length()) + end;
        }
        return result;
    }
}
