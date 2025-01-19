package coding_bat.arsen.D.warm_up1;

public class Front3 {
    public String front3(String str) {

        String front = str.length()>=3? str.substring(0, 3) : str;
        return front + front + front ;
    }
}
