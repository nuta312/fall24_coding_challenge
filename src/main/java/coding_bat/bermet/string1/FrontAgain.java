package coding_bat.bermet.string1;

public class FrontAgain {
    public boolean frontAgain(String str) {
        if (str.length() < 2){
            return false;
        }
        if (str.length() == 2){
            return true;
        }
        if (str.substring(0,2).equals(str.substring(str.length()-2,str.length()))){
            return true;
        } else {
            return false;
        }
    }
}
