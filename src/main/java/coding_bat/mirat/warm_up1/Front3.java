package coding_bat.mirat.warm_up1;

public class Front3 {
    public String front3(String str) {
        if (str.length() > 3){
            str = str.substring(0,3);
            return str+str+str;
        }
        else{
            return str+str+str;
        }

    }
}
