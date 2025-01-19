package coding_bat.dastanA.string_1;

public class DeFront {
    public String deFront(String str) {
        String first = "";
        String second = "";
        String newStr = "";
        if (str.length() >= 2) {
            first = String.valueOf(str.charAt(0));
            second = String.valueOf(str.charAt(1));
            newStr = str.substring(2);
        }
        String exceptFirst = "a";
        String exceptSecond = "b";

        String result = (str.length() < 2) ? str :
                        (!first.equals(exceptFirst) && !second.equals(exceptSecond)) ? newStr :
                        (first.equals(exceptFirst) && !second.equals(exceptSecond)) ? first.concat(newStr) :
                        (!first.equals(exceptFirst) && second.equals(exceptSecond)) ? second.concat(newStr) :
                        str;
        return result;
    }
    }
