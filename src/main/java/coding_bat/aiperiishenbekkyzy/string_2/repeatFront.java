package coding_bat.aiperiishenbekkyzy.string_2;

public class repeatFront {
    public String repeatFront(String str, int n) {
        StringBuilder stbuild = new StringBuilder((n*n + n)/2);
        for(int i = n; i >= 1; i--)
        {
            for(int k = 0; k < i; k++)
                stbuild.append(str.charAt(k));
        }
        return stbuild.toString();
    }

}
