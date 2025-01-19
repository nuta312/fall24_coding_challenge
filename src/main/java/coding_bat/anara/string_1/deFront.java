package coding_bat.anara.string_1;

public class deFront {
    public String deFront(String str) {
        int len = str.length();
        if (len >= 2) {
            StringBuilder stb = new StringBuilder(len);
            if (str.charAt(0) == 'a')
                stb.append('a');
            if (str.charAt(1) == 'b')
                stb.append('b');
            stb.append(str.substring(2));
            return stb.toString();
        } else if (len == 1 && str.charAt(0) == 'a')
            return "a";
        else
            return "";
    }
}
