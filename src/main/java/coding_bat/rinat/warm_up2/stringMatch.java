package coding_bat.rinat.warm_up2;

public class stringMatch {
    public int stringMatch(String a, String b) {
        int min = Math.min(a.length(), b.length());
        int count = 0;

        for(int i = 0; i < min - 1; i++) {
            if(a.substring(i, i + 2).equals(b.substring(i, i + 2)))
                count++;
        }

        return count;
    }

}
