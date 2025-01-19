package coding_bat.dastanA.string_1;

public class ExtraFront {
    public String extraFront(String str) {
        String firstChars = str.length() < 2 ? str : str.substring(0,2);
        return firstChars.concat(firstChars).concat(firstChars);
    }
}
