package coding_bat.gulasal.warm_up2;

public class Last2 {
    public int last2(String str) {
        if (str.length()<3) {
            return 0;
        }

        int count = 0;
        for(int i = 0; i < str.length()-2; i++){
            if (str.substring(i,i+2).equals(str.substring(str.length()-2))) {
                count++;
            }
        }
        return count;
    }
}
