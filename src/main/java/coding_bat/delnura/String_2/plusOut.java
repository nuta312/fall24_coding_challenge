package coding_bat.delnura.String_2;

public class plusOut {
    public String plusOut(String str, String word) {
        StringBuffer result = new StringBuffer();
        int i = 0;

        while(i < str.length()) {
            if(i <= str.length() - word.length() &&
                    str.substring(i, i + word.length()).equals(word)) {
                result.append(word);
                i += word.length();
            } else {
                result.append("+");
                i++;
            }
        }

        return result.toString();
    }
}
