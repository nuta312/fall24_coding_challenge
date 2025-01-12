package coding_bat.arsen.D.string_1;

public class LastChars {

    public String lastChars(String a, String b) {
        String fi = a.isEmpty() ? "@":
                String.valueOf(a.charAt(0));

        String fi1 = b.isEmpty() ? "@":
                String.valueOf(b.charAt(b.length()-1));
        return fi + fi1;
    }
}
