package coding_bat.begimai.warm_up2;

public class Last2 {
    public int last2(String str) {
        // If the string length is less than 2, there can be no matches
        if (str.length() < 2) {
            return 0;
        }

        // Extract the last 2 characters of the string
        String last2 = str.substring(str.length() - 2);
        int count = 0;

        // Iterate over the string, stopping before the last 2 characters
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2); // Extract a substring of length 2
            if (sub.equals(last2)) {
                count++; // Increment the count if there's a match
            }
        }

        return count;
    }

}
