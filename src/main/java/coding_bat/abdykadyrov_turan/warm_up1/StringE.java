package coding_bat.abdykadyrov_turan.warm_up1;

public class StringE {
    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return (count <= 3 && count >= 1);
    }
}
