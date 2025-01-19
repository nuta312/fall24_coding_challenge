package coding_bat.delnura.warm_up1;

public class endUp {
    public String endUp(String str) {

        if (str.length() <= 3) {
            return str.toUpperCase();
        }

        String firstPart = str.substring(0, str.length() - 3);
        String lastThree = str.substring(str.length() - 3);


        return firstPart + lastThree.toUpperCase();
    }
}
