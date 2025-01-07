package coding_bat.aiza.string1;

public class extraEnd {
    public String extraEnd(String str) {
        String lastTwo = str.substring(str.length()-2);
        String result = lastTwo + lastTwo + lastTwo;
        return  result;
    }
}
