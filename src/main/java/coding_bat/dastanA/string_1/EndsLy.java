package coding_bat.dastanA.string_1;

public class EndsLy {
    public boolean endsLy(String str) {
        if (str.length() >= 2) {
            if (str.substring(str.length() - 2).equals("ly")) {
                return true;
            }
        }
        return false;
    }

}
