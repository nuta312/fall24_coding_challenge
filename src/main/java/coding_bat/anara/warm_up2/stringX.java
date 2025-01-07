package coding_bat.anara.warm_up2;

public class stringX {
    public String stringX(String str) {
        if (str.length() < 2) {
            return str;
        }
        char First = str.charAt(0);
        char Last = str.charAt(str.length()-1);
        String mid = str.substring(1,str.length()-1);
        StringBuilder result = new StringBuilder();
        for (char c : mid.toCharArray()){
            if (c != 'x'){
                result.append(c);
            }
        }
        mid = result.toString();
        return First + mid + Last;

    }
}
