package coding_bat.bermet.string1;

public class WithoutX2 {
    public String withoutX2(String str) {
        if (str.length() == 1 && str.equals("x")) {
            return "";
        }
        if (str.length() == 0) {
            return str;
        }
        if (str.equals("xx")) {
            return "";
        }

        if (str.substring(0,2).equals("xx")){
            return str.substring(2);
        } else if (str.charAt(0) == 'x'){
            return str.substring(1);
        } else if (str.charAt(1) == 'x'){
            return str.substring(0,1) + str.substring(2);
        } else {
            return str;
        }
    }
}
