package coding_bat.aiperiishenbekkyzy.string_2;

public class sameStarChar {
    public boolean sameStarChar(String str) {
        int len = str.length() - 1;
        for(int i = 1; i < len; i++)
        {
            if(str.charAt(i) == '*')
            {
                if(str.charAt(i-1) != str.charAt(i+1))
                    return false;
            }
        }
        return true;
    }
}
