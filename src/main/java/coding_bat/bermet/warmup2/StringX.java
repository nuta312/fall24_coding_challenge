package coding_bat.bermet.warmup2;

public class StringX {
    public String stringX(String str) {
        if (str.length() == 0) {
            return str;
        }

        // If the string is a single character, return it as is
        if (str.length() == 1) {
            return str;
        }

        // Handle the middle part (remove 'x' except at the beginning and end)
        String middle = str.substring(1, str.length() - 1).replace("x", "");

        // Concatenate the preserved first and last characters with the modified middle part
        return str.charAt(0) + middle + str.charAt(str.length() - 1);
    }
}
