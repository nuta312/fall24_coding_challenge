package coding_bat.anara.string_1;

public class withoutX {
    public String withoutX(String str) {
        if (str.length() == 0){
            return "";
        }
        if (str.length() == 1 && str.charAt(0) == 'x'){
            return "";
        }
        if (str.startsWith("x") && str.endsWith("x")){
            return str.substring(1,str.length()-1);
        }
        if (str.startsWith("x")){
            return str.substring(1);}
        char ch = str.charAt(0);
        if (ch != 'x' && str.endsWith("x")){
            return str.substring(0,str.length()-1);
        }
        return str;
    }
}
