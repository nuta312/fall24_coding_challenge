package coding_bat.aiperiishenbekkyzy.string_2;

public class zipZap {
    public String zipZap(String str) {
        int len = str.length();
        int lim = len - 2;
        int i = 0;
        char ch;
        StringBuilder stbuild = new StringBuilder(len);
        while(i < len)
        {
            ch = str.charAt(i);
            if(ch == 'z' && i < lim && str.charAt(i+2) == 'p')
            {
                stbuild.append("zp");
                i += 3;
            }
            else
            {
                stbuild.append(ch);
                i++;
            }
        }
        return stbuild.toString();
    }

}
