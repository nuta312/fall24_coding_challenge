package coding_bat.dastanA.string_1;

public class FrontAgain {
    public boolean frontAgain(String str) {
        return str.length() >= 2 ? str.startsWith(str.substring(str.length()-2)) : false;
    }
}
