package coding_bat.aiza.warm_up1;

public class front22 {
    public String front22(String str) {
        String front = str.length() < 2 ? str : str.substring(0, 2);
        return front + str + front;
    }
}
