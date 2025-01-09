package coding_bat.gera.string1;

public class FrontAgain {
    public boolean frontAgain(String str) {
        if (str.length() < 2){
            return false;
        }
        else {
            String start = str.substring(0, 2);
            String end = str.substring(str.length() - 2);
            return start.equals(end);
        }
    }
}
