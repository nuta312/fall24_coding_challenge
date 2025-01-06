package coding_bat.delnura.warm_up1;

public class front3 {
    public String front3(String str) {
        String begin = str.length() < 3 ? str : str.substring(0, 3);
        return begin + begin + begin ;
    }
}
