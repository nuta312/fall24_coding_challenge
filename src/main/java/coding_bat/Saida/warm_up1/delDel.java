package coding_bat.Saida.warm_up1;

public class delDel {
    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1,4).equals("del") ){
            return str.charAt(0) + str.substring(4);
        }
        else {
            return str;
        }
    }
}
