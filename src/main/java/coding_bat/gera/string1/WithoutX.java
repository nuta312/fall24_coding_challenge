package coding_bat.gera.string1;

public class WithoutX {
    public String withoutX(String str) {
        if (str.length() <= 1){
            return "";
        }

        String without1 = str.substring(1);
        String end = str.substring(0, str.length() - 1);
        String mid = str.substring(1, str.length() - 1);
        if (str.charAt(0) == 'x' && str.substring(str.length() - 1).equals("x")) {
            return mid;
        }
        if (str.charAt(0) == 'x') {
            return without1;
        } else if (str.substring(str.length() - 1).equals("x")){
            return end;
        }

        return str;

    }
}
