package coding_bat.anara.string_1;

public class withoutX2 {
    public String withoutX2(String str) {
        int len = str.length();
        if (len >= 2) {
            char ch = str.charAt(0);
            StringBuilder stb = new StringBuilder(len);
            if (ch != 'x')
                stb.append(ch);
            ch = str.charAt(1);
            if (ch != 'x')
                stb.append(ch);
            stb.append(str.substring(2));
            return stb.toString();
        }
        else if (len == 1 && str.charAt(0) == 'x')
            return "";
        else
            return str;

    }
}
