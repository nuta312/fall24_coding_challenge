package coding_bat.Maksim.string_1;

public class TheEnd {
    public String theEnd(String str, boolean front) {
        if (front == true){
            return str.substring(0,1);
        }
        else if (front == false){
            return str.substring(str.length()-1);
        }
        return str;
    }
}
