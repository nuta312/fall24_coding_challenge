package coding_bat.gulasal.warm_up2;

public class StringBits {
    public String stringBits(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(i%2==0){
                result += str.charAt(i);
            }
        }
        return result;
    }
}
