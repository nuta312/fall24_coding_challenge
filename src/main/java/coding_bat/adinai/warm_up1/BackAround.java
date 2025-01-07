package coding_bat.adinai.warm_up1;

public class BackAround {
    public String backAround(String str) {
        char lastIndex = str.charAt(str.length()-1);
        return lastIndex + str + lastIndex;
    }
}
