package coding_bat.bermet.warmup2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        if (n == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++){
            sb.append(str);
        }
        return sb.toString();
    }
}
