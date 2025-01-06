package coding_bat.aiperiishenbekkyzy.warm_up1;

public class front3 {
    public String front3(String str) {
        int frontEnd = 3;
        if (str.length() < frontEnd) {
            frontEnd = str.length();
        }

        String front = str.substring(0, frontEnd);
        return front + front + front;
    }

}
