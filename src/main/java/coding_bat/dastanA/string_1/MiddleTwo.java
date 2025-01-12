package coding_bat.dastanA.string_1;

public class MiddleTwo {
    public String middleTwo(String str) {
        String middleStr = str.substring(str.length()/2-1, str.length()/2+1);
        return middleStr;
    }
}
