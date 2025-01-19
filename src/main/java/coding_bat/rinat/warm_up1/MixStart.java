package coding_bat.rinat.warm_up1;

public class MixStart {public boolean mixStart(String str) {
    if (str.length() > 2){
        if (str.substring(0,3).contains("ix")){
            return true;
        }
    }
    return false;
}
}
