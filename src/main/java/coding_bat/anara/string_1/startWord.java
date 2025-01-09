package coding_bat.anara.string_1;

public class startWord {
    public String startWord(String str, String word) {
        if (str.length() >= word.length() && word.substring(1)
                .equals(str.substring(1,word.length()))) {
            return str.charAt(0) + str.substring(1, word.length());}
        else

            return "";
    }

}
