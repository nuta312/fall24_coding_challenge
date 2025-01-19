package coding_bat.akylai.string_2;

public class StarOut {
    public String starOut(String str) {
        int len = str.length();
        String newStr = "";
        for (int i = 0; i < len; i++) {
            if (i == 0 && str.charAt(i) != '*')
                newStr += str.charAt(i);
            if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
                newStr += str.charAt(i);
            if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
                newStr = newStr.substring(0,newStr.length()-1);
        }
        return newStr;
    }
}
