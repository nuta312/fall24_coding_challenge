package coding_bat.aiperiishenbekkyzy.warm_up1;

public class endUp {
    public String endUp(String str) {
        int beginUpper = str.length()-3;
        int length = str.length();

        if (str.length() < 3)
            return str.toUpperCase();

        String upper = str.substring(beginUpper, length).toUpperCase();

        return str.substring(0, beginUpper) + upper;
    }
}
