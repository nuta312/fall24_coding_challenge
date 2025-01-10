package coding_bat.akylai.string_1;

public class ConCat {
    public String conCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return a + b;
        }
        if (a.substring(a.length() - 1).equals(b.substring(0,1))){
            return a + b.substring(1);}
        return a + b;
    }
}
