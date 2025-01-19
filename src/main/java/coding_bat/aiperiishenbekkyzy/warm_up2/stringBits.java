package coding_bat.aiperiishenbekkyzy.warm_up2;

public class stringBits {
    public String stringBits(String str) {

        int len = str.length();

        String temp = "";

        for (int i = 0; i < len; i = i + 2) {

            temp += str.charAt(i);

        }
                return temp;

    }
    }
