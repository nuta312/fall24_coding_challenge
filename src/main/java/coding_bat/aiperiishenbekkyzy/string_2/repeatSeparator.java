package coding_bat.aiperiishenbekkyzy.string_2;

public class repeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        if(count == 0)
            return "";
        StringBuilder stbuild = new StringBuilder(count*word.length()+sep.length()*(count-1));
        for(int i = 1; i < count; i++)
        {
            stbuild.append(word);
            stbuild.append(sep);
        }
        stbuild.append(word);
        return stbuild.toString();
    }

}
