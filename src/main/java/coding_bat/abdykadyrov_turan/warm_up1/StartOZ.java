package coding_bat.abdykadyrov_turan.warm_up1;

public class StartOZ {
    public String startOz(String str) {
        if (str.startsWith("oz")){
            return "oz";
        }else if (str.startsWith("o", 0)){
            return "o";
        }else if (str.startsWith("z",1)){
            return "z";
        }else {
            return "";
        }
    }
}
