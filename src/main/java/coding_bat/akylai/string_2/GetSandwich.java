package coding_bat.akylai.string_2;

public class GetSandwich {
    public String getSandwich(String str) {
        String word = "bread";
        if (str.contains(word)) {
            if (str.indexOf(word) != -1 && str.lastIndexOf(word) != str.indexOf(word)) {
                int index1 = str.indexOf(word);
                int index2 = str.lastIndexOf(word);

                return str.substring(index1 + word.length(), index2);
            }
        }
        return "";
    }
}
