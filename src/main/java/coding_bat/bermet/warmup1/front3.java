package coding_bat.bermet.warmup1;

public class front3 {
    public String front3(String str) {
        String front;
        if (str.length() < 3){
            front = str;
        } else  {
            front = str.substring(0,3);
        }
        return front + front + front;
    }
}
