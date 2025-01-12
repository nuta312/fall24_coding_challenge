package coding_bat.bermet.string1;

public class MiddleThree {
    public String middleThree(String str) {
        int count = str.length() /2;
        if (str.length() == 3){
            return str;
        } else {
            return str.substring(count -1, count + 2);
        }
    }
}
