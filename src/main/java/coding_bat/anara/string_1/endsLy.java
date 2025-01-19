package coding_bat.anara.string_1;

public class endsLy {
    public boolean endsLy(String str) {
        if (str.length() > 1 && str.substring(str.length() - 2, str.length()).equalsIgnoreCase("ly")) {
            return true;
        }
        return false;
    }
}
