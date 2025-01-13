package coding_bat.akylai.string_1;

public class StartWord {
    public String startWord(String str, String word) {
        if (str.isEmpty()) {
            return "";
        }
        if(word.length() > str.length()){
            return "";
        }
        if (word.length() == 1){
            return str.substring(0,1);
        } else if(str.substring(1, word.length()).equals(word.substring(1))){
            return str.substring(0, word.length());
        }
        return "";
    }

}
