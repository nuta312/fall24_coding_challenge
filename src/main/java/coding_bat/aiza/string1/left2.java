package coding_bat.aiza.string1;

public class left2 {
    public String left2(String str) {
        String firstTwo = str.substring(0,2);
        String remaining = str.substring(2);
        return remaining + firstTwo;
    }
}
