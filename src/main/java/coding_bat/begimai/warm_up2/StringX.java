package coding_bat.begimai.warm_up2;

public class StringX {
    public String stringX(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        String middle = str.substring(1, str.length() - 1);

        middle = middle.replace("x", "");

        return firstChar + middle + lastChar;
    }

}
