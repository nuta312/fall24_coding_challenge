package coding_bat.nasyikat.warm_up2;

public class StringX {
    public String stringX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            // Only append the char if it is not the "x" case
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1); // Could use str.charAt(i) here
            }
        }
        return result;
    }
}
