package coding_bat.daulet.warm_up1;

public class stringE {
    public boolean stringE(String str) {

        int count = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
            // alternately: str.substring(i, i+1).equals("e")
        }
        return (count >= 1 && count <= 3);
    }
}
