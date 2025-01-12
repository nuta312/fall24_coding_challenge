package coding_bat.akylai.string_1;

public class SeeColor {
    public String seeColor(String str) {
        if (str.toLowerCase().startsWith("red")) {
            return "red";
        } else if (str.toLowerCase().startsWith("blue")) {
            return "blue";
        }
        return "";
    }
}
