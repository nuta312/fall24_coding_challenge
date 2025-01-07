package coding_bat.rano.string1;

public class MiddleTwo {
    public String middleTwo(String str) {
        int middleIndex = str.length() / 2;
        return str.substring(middleIndex - 1, middleIndex + 1);
    }
}
