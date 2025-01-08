package coding_bat.begimai.warm_up2;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int minLength = Math.min(a.length(), b.length()); // Ensure no out-of-bounds issues
        int counter = 0;
        for(int i = 0; i < minLength -1; i++) {
            if(a.substring(i, i+2).equals(b.substring(i, i+2))){
                counter++;
            }
        }
        return counter++;
    }
}
