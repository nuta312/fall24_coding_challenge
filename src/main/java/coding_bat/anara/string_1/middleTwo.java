package coding_bat.anara.string_1;

public class middleTwo {
    public String middleTwo(String str) {
        String half1 = str.substring(0,str.length() / 2);
        String half2 = str.substring(str.length() / 2);
        if (str.length() >= 2) {
            return (half1.substring(half1.length()-1) + half2.substring(0,1));
        }
        return str;
    }
}
