package coding_bat.aidin.warm_up1;

public class everyNth {
    public String everyNth(String str, int n) {
        String temp = "";
        for (int i = 0; i < str.length();i = i + n)
            temp += str.charAt(i);
        return temp;

    }
}
