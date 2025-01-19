package coding_bat.Maksim.warm_up2;

public class StringX {
    public String stringX(String str) {
        String result = "";
        int len = str.length();
        for (int i = 0; i < len; i++){
            char temp = str.charAt(i);
            if (!(i > 0 && i < len - 1 && temp == 'x'))
                result = result + temp;
        }
        return result;
    }
}
