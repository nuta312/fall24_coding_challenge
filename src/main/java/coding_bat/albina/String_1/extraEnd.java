package coding_bat.albina.String_1;

public class extraEnd {
    public String extraEnd(String str) {
        String last2 = str.substring(str.length() - 2);
        return last2 + last2 + last2;
    }

}
