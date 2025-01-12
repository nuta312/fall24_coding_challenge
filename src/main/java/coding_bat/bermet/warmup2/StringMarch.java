package coding_bat.bermet.warmup2;

public class StringMarch {
    public int stringMatch(String a, String b) {
        int count = 0;
        int maxLen = Math.min(a.length(), b.length());

        for (int i = 0; i < maxLen - 1; i ++){
            String A = a.substring(i,i + 2);
            String B = b.substring(i,i + 2);

            if (A.equals(B)){
                count ++;
            }
        }
        return count;
    }
}
