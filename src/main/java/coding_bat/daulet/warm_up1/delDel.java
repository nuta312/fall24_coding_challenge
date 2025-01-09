package coding_bat.daulet.warm_up1;

public class delDel {
    public String delDel(String str) {
        if(str.length() >= 4){
            if(str.substring(1,4).equals("del")){
                return str.substring(0,1).concat(str.substring(4));
            }
        }return str;
    }
}
