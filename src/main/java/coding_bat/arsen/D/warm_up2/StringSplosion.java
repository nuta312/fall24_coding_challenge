package coding_bat.arsen.D.warm_up2;

public class StringSplosion {

    public String stringSplosion(String str) {
        String result = "";
        for (int i =1; i <= str.length() ;i++){
            result += str.substring(0,i);
        }
        return result;
    }
}
