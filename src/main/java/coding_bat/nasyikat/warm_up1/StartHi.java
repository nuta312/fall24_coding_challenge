package coding_bat.nasyikat.warm_up1;

public class StartHi {
    public boolean startHi(String str) {
        if (str.length() < 2) return false;
        String firstTwo = str.substring(0, 2);
        return(firstTwo.equals("hi"));
    }
}
