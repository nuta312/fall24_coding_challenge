package coding_bat.aidai.warm_up2;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int count = 0;
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength - 1; i++) {
            String substringA = a.substring(i, i + 2);
            String substringB = b.substring(i, i + 2);
            if (substringA.equals(substringB)) {
                count++;
            }
        }
        return count;
    }
}
