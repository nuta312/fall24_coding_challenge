package coding_bat.anara.string_1;

public class extraFront {
    public String extraFront(String str) {
        if (str.length() >=2){
            return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
        } return str + str +str;
    }
}
