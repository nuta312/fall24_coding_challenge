package coding_bat.aiza.warmup_2;

public class last2 {
    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        String start = "";
        String end = str.substring(str.length()-2);
        int count = 0;
        for (int i = 0; i <str.length() -2; i++){
            start = str.substring(i, i + 2);
            if (start.equals(end)){
                count++;
            }
        }
        return count;
    }
}
