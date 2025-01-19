package coding_bat.dastanA.string_1;

public class SeeColor {
    public String seeColor(String str) {
        String color = str.startsWith("red") ? "red" : str.startsWith("blue") ? "blue" : "";
        return color;
    }
}
