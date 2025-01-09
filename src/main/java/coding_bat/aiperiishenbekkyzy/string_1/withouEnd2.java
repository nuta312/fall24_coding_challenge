package coding_bat.aiperiishenbekkyzy.string_1;

public class withouEnd2 {
    public String withouEnd2(String str) {
        int len = str.length();

        if (len < 3)

            return "";

        else

            return str.substring(1, str.length() - 1);

    }
}
