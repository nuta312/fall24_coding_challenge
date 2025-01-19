package coding_bat.akylai.warm_up2;

public class StringX {
    public String stringX(String str) {
        if (str.length() < 3) {
            return str;
        }
        StringBuilder result = new StringBuilder(str);
        for (int i = 1; i < result.length() - 1; i++) {
            if (Character.toLowerCase(result.charAt(i)) == 'x') {
                result.delete(i, i+1);
                i--;
            }
        }
        return result.toString();
    }
}
