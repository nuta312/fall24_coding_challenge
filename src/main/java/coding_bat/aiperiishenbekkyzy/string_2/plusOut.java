package coding_bat.aiperiishenbekkyzy.string_2;

public class plusOut {
    public String plusOut(String str, String word) {
        int len = str.length();
        int wLen = word.length();
        int pos = str.indexOf(word);
        int i = 0;
        StringBuilder stbuild = new StringBuilder(len);
        while(pos != -1)
        {
            while(i < pos)
            {
                stbuild.append('+');
                i++;
            }
            stbuild.append(word);
            i = pos + wLen;
            pos = str.indexOf(word, i);
        }
        for(; i < len; i++)
            stbuild.append('+');
        return stbuild.toString();
    }



}
