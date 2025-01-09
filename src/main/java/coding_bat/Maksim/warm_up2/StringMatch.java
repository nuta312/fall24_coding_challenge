package coding_bat.Maksim.warm_up2;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int count = 0;
        // Find the shorter length of the two strings to avoid out-of-bounds errors
        int minLength = Math.min(a.length(), b.length());

        // Loop through the strings up to length - 1
        for (int i = 0; i < minLength - 1; i++) {
            // Get the length-2 substrings for both strings at the current index
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);

            // Compare the substrings
            if (aSub.equals(bSub)) {
                count++;
            }
        }
        return count;
    }
}
