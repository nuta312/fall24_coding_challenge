package coding_bat.anara.string_1;

public class middleThree {
    public String middleThree(String str) {
        int middleIndex = str.length() / 2;
        if (str.length() > 3 && str.length() % 2 != 0) {
            return str.substring(middleIndex - 1, middleIndex + 2);

        }return str;
    }

}
