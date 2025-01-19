package coding_bat.daulet.warm_up2;

public class stringBits {
    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i+= 2) {
            int end = i +1;
            if (end > str.length()){
                end = str.length();
            }
            result = result + str.substring(i, end);
        }
        return result;
    }

}
