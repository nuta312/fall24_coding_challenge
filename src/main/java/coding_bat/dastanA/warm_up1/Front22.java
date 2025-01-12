package coding_bat.dastanA.warm_up1;

public class Front22 {
    public String front22(String str) {
        int length = 2;
        if (length > str.length()) {
            length = str.length();
        }
        String frontEnd = str.substring(0,length);
        return frontEnd + str + frontEnd;
    }
}
