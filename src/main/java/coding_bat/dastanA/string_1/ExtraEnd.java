package coding_bat.dastanA.string_1;

public class ExtraEnd {
    public String extraEnd(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            result.append(str.substring(str.length() - 2));
        }
        return result.toString();
    }
}
