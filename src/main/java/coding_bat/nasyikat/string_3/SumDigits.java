package coding_bat.nasyikat.string_3;

public class SumDigits {
    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (Character.isDigit(c)){
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
    }
}
