package coding_bat.begayim.warm_up1;

public class Front22 {
    public String front22(String str) {
        // First figure the number of chars to take
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }

        String front = str.substring(0, take);
        return front + str + front;
    }
}
