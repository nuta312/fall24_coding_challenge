package coding_bat.bermet.string1;

public class WithoutX {
    public String withoutX(String str) {
        if (str.length() == 1 && str.equals("x")){
            return "";
        }
        if (str.length() == 0){
            return str;
        }
        if (str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x'){
            return str.substring(1,str.length()-1);
        } else if (str.charAt(0) == 'x') {
            return str.substring(1);
        } else if (str.charAt(str.length()-1) == 'x'){
            return str.substring(0, str.length()-1);
        } else {
            return str;
        }
    }
}
