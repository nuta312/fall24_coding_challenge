package coding_bat.begimai.string1;

public class TheEnd {
    public String theEnd(String str, boolean front) {
        if(front){
            return String.valueOf(str.charAt(0)); // changes char to String using wrapper class
        }
        return String.valueOf(str.charAt(str.length()-1));
    }
}
