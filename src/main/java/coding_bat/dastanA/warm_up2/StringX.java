package coding_bat.dastanA.warm_up2;

public class StringX {
    public String stringX(String str) {
        if (str.length() < 3) {
            return str;
        }
        StringBuilder result = new StringBuilder();

        if (str.charAt(0) == 'x'){
            result.append('x');
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'x') {
                result.append(str.charAt(i));
            }
        }
        if (str.charAt(str.length()-1) == 'x') {
            result.append('x');
        }
        return result.toString();
    }
}
