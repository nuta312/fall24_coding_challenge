package coding_bat.dastanA.string_1;

public class Without2 {
    public String without2(String str) {
        String start = "";
        String end = "";

        if (str.length() > 2) {
            start = str.substring(0, 2);
            end = str.substring(str.length() - 2);
        }

        String result = (str.length() < 2) ? str : (start.equals(end)) ? str.substring(2) : "";
        return result;
    }
}
