package coding_bat.dastank.warm_up2;

public class DoubleX {
    boolean doubleX(String str) {
        if(str.contains("xx")){
            if(str.substring(str.indexOf('x'),str.indexOf('x')+2).contains("xx")){

            }else{
                return false;
            }
        }else{
            return false;
        }
        return true;
    }
}
