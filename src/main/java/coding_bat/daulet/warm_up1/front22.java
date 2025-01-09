package coding_bat.daulet.warm_up1;

public class front22 {
    public String front22(String str) {
        int er = 2;
        if(er > str.length()){
            er = str.length();
        }
        String front = str.substring(0,er);
        return front + str + front;
    }
}
