package coding_bat.mirat.warm_up1;

public class Front22 {
    public String front22(String str) {
        if (str.length()>2){
            String front = str.substring(0,2);
            return front+str+front;

        }
        return str+str+str;
    }
}
