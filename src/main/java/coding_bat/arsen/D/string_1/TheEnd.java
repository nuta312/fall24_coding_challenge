package coding_bat.arsen.D.string_1;

public class TheEnd {

    public String theEnd(String str, boolean front) {
        if (front){
            return str.substring(0,1);
        }else {
            return str.substring(str.length()-1);
        }
    }
}
