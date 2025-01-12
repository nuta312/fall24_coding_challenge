package coding_bat.alia_warmup1.alia_string1;

public class extraEnd {
    public String extraEnd(String str) {
        String Last=str.substring(str.length()-2);
        return Last+Last+Last;
    }
}
