package coding_bat.Saida.warm_up1;

public class backAround {
    public String backAround(String str) {
        char lastChar = str.charAt(str.length()-1);
        return lastChar + str + lastChar;
    }
}
