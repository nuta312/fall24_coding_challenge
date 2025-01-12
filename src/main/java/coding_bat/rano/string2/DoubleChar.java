package coding_bat.rano.string2;

public class DoubleChar {
    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            result += currentChar;
            result +=currentChar;
        }
        return result;
    }
}
