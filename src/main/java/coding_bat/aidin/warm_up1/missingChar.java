package coding_bat.aidin.warm_up1;

public class missingChar {
    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1);
        return front + back;

    }
}
