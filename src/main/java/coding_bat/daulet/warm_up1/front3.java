package coding_bat.daulet.warm_up1;

public class front3 {
    public String front3(String str) {
        int er = 3;
        if(er > str.length()){
            er = str.length();
        }
        String front = str.substring(0,er);
        return front + front + front;
    }
}
