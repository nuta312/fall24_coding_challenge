package coding_bat.nasyikat.string_3;

public class NotReplace {
    public String notReplace(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                boolean isStartValid = (i == 0 || !Character.isLetter(str.charAt(i - 1)));
                boolean isEndValid = (i + 2 == str.length() || !Character.isLetter(str.charAt(i + 2)));
                if (isStartValid && isEndValid) {
                    result.append("is not");
                    i += 2;
                    continue;
                }
            }
            result.append(str.charAt(i));
            i++;
        }
        return result.toString();
    }
}
