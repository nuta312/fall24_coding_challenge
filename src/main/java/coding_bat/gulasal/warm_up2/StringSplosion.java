package coding_bat.gulasal.warm_up2;

public class StringSplosion {
    public String stringSplosion(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++){
            result += str.substring(0, i+1);
        }
        return result;
    }

}
