package coding_bat.rinat.warm_up2;

public class StringX {
    public String stringX(String str) {
        if(str.length() < 2)
            return str;

        char[] result = new char[str.length()];
        result[0] = str.charAt(0);

        int count = 1;
        for(int i = 1; i < str.length() - 1; i++) {
            if(str.charAt(i) != 'x') {
                result[count] = str.charAt(i);
                count++;
            }
        }

        result[count] = str.charAt(str.length() - 1);
        count++;
        return new String(result, 0, count);
    }

}
