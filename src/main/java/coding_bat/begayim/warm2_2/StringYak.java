package coding_bat.begayim.warm2_2;

public class StringYak {
    public String stringYak(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length()-3 && str.charAt(i) == 'y' && str.charAt(i+2) == 'k'){
                i+=2;
            }
            else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
