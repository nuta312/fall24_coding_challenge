package coding_bat.begimai.warm_up1;

public class BackAround {
    public String backAround(String str) {
        char charSymb;
        charSymb = str.charAt(str.length()-1);
        return charSymb + str + charSymb;
    }

}
