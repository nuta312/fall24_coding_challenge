package coding_bat.dastanA.warm_up2;

public class StringSplosion {
    public String stringSplosion(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= str.length(); i++){
            sb.append(str.substring(0,0) + str.substring(0, i));
        }
        return sb.toString();
    }
}
