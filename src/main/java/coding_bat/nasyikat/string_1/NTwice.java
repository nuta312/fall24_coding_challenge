package coding_bat.nasyikat.string_1;

public class NTwice {
    public String nTwice(String str, int n) {
        String first = str.substring(0, n);
        String last = str.substring(str.length() - n);
        return first + last;
    }
}
