package coding_bat.anara.warm_up2;

public class stringBits {
    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i <str.length(); i += 2){
            result += str.charAt(i);
        }
        return result;
    }
}
