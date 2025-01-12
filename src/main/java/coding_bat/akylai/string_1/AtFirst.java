package coding_bat.akylai.string_1;

public class AtFirst {
    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0,2);
        }else if (str.isEmpty()){
            return str + '@' + '@';
        } else {
            return str + '@';
        }
    }
}
