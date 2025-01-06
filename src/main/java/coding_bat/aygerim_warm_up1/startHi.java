package coding_bat.aygerim_warm_up1;

public class startHi {
    public boolean startHi(String str) {
        if (str.length()< 2) return false;
        String firstTwo = str.substring(0,2);
        if (firstTwo.equals("hi")) {
            return true;


        } else {
            return false;

        }


    }

}
