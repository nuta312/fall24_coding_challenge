package coding_bat.daulet.warm_up2;

public class stringSplosion {
    public String stringSplosion(String str) {

        String result = "";
        // On each iteration, add the substring of the chars 0..i
        for (int i=0; i<str.length(); i++) {
            result = result + str.substring(0, i+1);
        }
        return result;
    }

}
