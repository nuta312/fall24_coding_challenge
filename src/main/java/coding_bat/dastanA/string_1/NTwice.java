package coding_bat.dastanA.string_1;

public class NTwice {
    public String nTwice(String str, int n) {
        String nChars = str.substring(0,n).concat(str.substring(str.length()-n));
        return nChars;
    }

}
