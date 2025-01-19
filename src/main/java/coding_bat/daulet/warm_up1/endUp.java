package coding_bat.daulet.warm_up1;

public class endUp {
    public String endUp(String str) {

        if(str.length() < 3){
            return str.toUpperCase();
        }
        String c = str.substring(0,str.length()-3);
        String v = str.substring(str.length() - 3).toUpperCase();
        return c.concat(v);
    }

}
