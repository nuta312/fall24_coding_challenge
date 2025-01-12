package coding_bat.akylai.string_3;

public class SumDigits {
    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                String newStr = str.substring(i, i+1);
                sum += Integer.parseInt(newStr);
            }
        }
        return sum;
    }
}
