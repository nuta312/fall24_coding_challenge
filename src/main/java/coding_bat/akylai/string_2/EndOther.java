package coding_bat.akylai.string_2;

public class EndOther {
    public boolean endOther(String a, String b) {
        if (!a.isEmpty()) {
            a= a.toLowerCase();
            b = b.toLowerCase();
            if (!a.isEmpty() && !b.isEmpty()) {
                if (a.endsWith(b) || b.endsWith(a)) {
                    return true;
                }
            }
        }
        return false;
    }
}
