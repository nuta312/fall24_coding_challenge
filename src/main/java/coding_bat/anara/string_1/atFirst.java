package coding_bat.anara.string_1;

public class atFirst {
    public String atFirst(String str) {
        if (str.length() == 0){
            return "@@";

        } else if (str.length() == 1){
            return str + "@";
        } return str.substring(0,2);
    }
}
