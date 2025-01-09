package coding_bat.gera.string1;

public class DeFront {
    public String deFront(String str) {
        String strNew = str.substring(2, str.length());

        if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {

            return "a" + "b" + strNew;
        } else if (str.charAt(1) == 'b') {
            return 'b' + strNew;
        } else if (str.charAt(0) == 'a') {
            return 'a' + strNew;

        } else {
            return strNew;

        }
    }
}
