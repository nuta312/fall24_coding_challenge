package coding_bat.aiza.warm_up1;

public class endUp {
    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        String beginning = str.substring(0, str.length() - 3);
        String ending = str.substring(str.length() - 3).toUpperCase();

        return beginning + ending;
    }
}
