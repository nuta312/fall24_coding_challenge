package coding_bat.begimai.warm_up2;

public class AltPairs {
    public String altPairs(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i += 4) {
            sb.append(str.charAt(i));
            if (i + 1 < str.length()) {
                sb.append(str.charAt(i + 1));
            }
        }

        return sb.toString();
    }

}
