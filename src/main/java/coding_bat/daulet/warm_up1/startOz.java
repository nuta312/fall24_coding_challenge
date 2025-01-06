package coding_bat.daulet.warm_up1;

public class startOz {
    public String startOz(String str) {

        if(str.length()==0){
            return "";
        }else if (str.startsWith("oz")){
            return str.substring(0,2);
        } else if (str.substring(0,1).contains("o")) {
            return str.substring(0,1);
        } else if (str.substring(1,2).contains("z")) {
            return str.substring(1,2);
        }else {
            return "";
        }
    }
}
