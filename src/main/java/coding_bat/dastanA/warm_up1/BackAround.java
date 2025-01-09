package coding_bat.dastanA.warm_up1;

public class BackAround {
    public String backAround(String str) {
        String letter = str.substring(str.length()-1);
        return letter + str + letter;
    }
}
