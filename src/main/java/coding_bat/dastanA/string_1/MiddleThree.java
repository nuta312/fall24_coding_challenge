package coding_bat.dastanA.string_1;

public class MiddleThree {
    public String middleThree(String str) {
        String middle3Chars = str.substring(str.length()/2-1, str.length()/2+2);
        return middle3Chars;
    }
}
