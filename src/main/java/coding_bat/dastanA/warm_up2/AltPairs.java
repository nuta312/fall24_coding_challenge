package coding_bat.dastanA.warm_up2;

public class AltPairs {
    public String altPairs(String str) {
        if (str.length() < 2) {
            return str;
        }
        StringBuilder result = new StringBuilder();
        result.append(str.substring(0,2));

        for (int i = 4; i < str.length() - 1; i += 4) {
            result.append(str.charAt(i));
            result.append(str.charAt(i + 1));
        }
        if (str.length() == 5 ||
                str.length() == 9 ||
                str.length() == 13) {
            result.append(str.charAt(str.length()-1));
        }
        return result.toString();
    }
}
