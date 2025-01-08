package coding_bat.gera.string1;

public class WithoutEnd {
    public String withoutEnd(String str) {
        if (str.length() > 2){
            String result =  str.substring(1, str.length()-1);
            return result;
        }
        else {
            return "";
        }
    }
}
