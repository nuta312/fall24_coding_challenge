package coding_bat.rano.warm_up1;

public class Front22 {
    public String front22(String str) {
        if (str.length () > 2){
            String temp = str.substring(0,2);
            return temp+str+temp;
        }
        else
            return str+str+str;
    }
}
