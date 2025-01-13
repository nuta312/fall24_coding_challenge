package coding_bat.akylai.string_2;

public class PlusOut {
    public String plusOut(String str, String word) {
        int i = 0;
        String str2 = "";
        while (i < str.length() - word.length()+1)
            if (!str.substring(i,i+word.length()).equals(word)) {
                str2 += "+";
                i++;
            }
            else {
                str2 += word;
                i += word.length();
            }
        if (i < str.length() && !str.substring(i).equals(word.substring(1))) {
            for (int j = 0; j < word.length()-1; j++) str2 += "+";
        }
        return str2;
    }
}
