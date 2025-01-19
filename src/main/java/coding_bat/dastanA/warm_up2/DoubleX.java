package coding_bat.dastanA.warm_up2;

public class DoubleX {
    boolean doubleX(String str) {
        StringBuilder sb = new StringBuilder();

        if (str.contains("xx")) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'x') {
                    sb.append(i + "x ");
                }
            }
            String [] x = sb.toString().split(" ");
            if ((int)(x[0].charAt(0)) == (int)x[1].charAt(0) - 1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
