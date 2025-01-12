package coding_bat.dastanA.string_1;

public class StartWord {
    public String startWord(String str, String word) {
        String result = "";
        if (str.length() >= word.length()) {
            if (word.length() == 1) {
                result = str.substring(0,1);
            } else if (word.length() > 1 && (str.substring(0,word.length()).equals(word) || str.substring(1,word.length()).equals(word.substring(1)))) {
                result = str.substring(0,word.length());
            } else {
                result = "";
            }
        }
        return result;
    }

}
