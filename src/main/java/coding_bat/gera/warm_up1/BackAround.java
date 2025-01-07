package coding_bat.gera.warm_up1;

public class BackAround {
    public String backAround(String str) {
        String str1 = str.substring(str.length()-1);
        return str1 + str + str1;

    }
}
