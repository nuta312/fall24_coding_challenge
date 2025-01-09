package coding_bat.nasyikat.string_3;

public class CountYZ {
    public int countYZ(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == 'y' || current == 'z') {
                if (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
                    count++;
                }
            }
        }
        return count;
    }
}
