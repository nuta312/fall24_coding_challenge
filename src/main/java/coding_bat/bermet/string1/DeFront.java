package coding_bat.bermet.string1;

public class DeFront {
    public String deFront(String str) {
        if (str.length() < 2){
            return str;
        }
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b'){
            return str;
        } else if (str.charAt(0) == 'a'){
            return str.substring(0,1) + str.substring(2);
        } else if (str.charAt(1) == 'b'){
            return str.substring(1);
        }else {
            return str.substring(2);
        }
    }
}
