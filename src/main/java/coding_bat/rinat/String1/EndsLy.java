package coding_bat.rinat.String1;

public class EndsLy {
    public boolean endsLy(String str) {
        if (str.length() <= 1 ){
            return false;
        }else {

            if (str.substring(str.length() - 2).equalsIgnoreCase("ly")) {
                return true;
            } else {
                return false;
            }
        }
    }
}
