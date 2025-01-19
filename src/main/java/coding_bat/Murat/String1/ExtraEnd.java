package coding_bat.Murat.String1;

public class ExtraEnd {
    public String extraEnd(String str) {
        return str.substring(str.length() - 2) + str.substring(str.length() - 2) +
                str.substring(str.length() - 2);
    }
}