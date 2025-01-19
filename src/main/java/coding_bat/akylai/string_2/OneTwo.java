package coding_bat.akylai.string_2;

public class OneTwo {
    public String oneTwo(String str) {
        if (str.length() < 3) {
            return "";
        }
        String newStr = "";
        for (int i = 0; i < str.length()-2; i+=3) {
            newStr = newStr + str.substring(i+1,i+3) + str.charAt(i);
        }
        return newStr;
    }
}
