package coding_bat.dastanA.warm_up2;

public class StringBits {
    public String stringBits(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i+=2){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
