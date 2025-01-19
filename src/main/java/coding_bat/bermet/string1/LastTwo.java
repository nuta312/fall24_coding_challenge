package coding_bat.bermet.string1;

public class LastTwo {
    public String lastTwo(String str) {
        String result;
        if (str.length() <= 1){
            return str;
        }
        if (str.length() == 2){
            str = str.substring(1) + str.substring(0,1);
            return str;
        } else {
            result = str.substring(0,str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
            return result;
        }
    }
}
