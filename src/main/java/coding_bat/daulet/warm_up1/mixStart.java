package coding_bat.daulet.warm_up1;

public class mixStart {
    public boolean mixStart(String str) {
        if(str.length()<3){
            return false;
        }
        if(str.substring(1,3).contains("ix")){
            return true;
        }return false;
    }
}
