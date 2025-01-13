package coding_bat.bermet.warmup1;

public class backAround {
    public String backAround(String str) {
        String back;
        char lastChar = str.charAt(str.length() - 1);

        return lastChar + str + lastChar;
    }
}
