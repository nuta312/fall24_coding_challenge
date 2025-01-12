package coding_bat.akylai.string_3;

public class SumNumbers {
    public int sumNumbers(String str) {
        int sum = 0;
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char x = str.charAt(i);
            if (Character.isDigit(x)) {
                number.append(x);
            } else {
                if (number.length() > 0){
                    sum += Integer.parseInt(number.toString());
                    number.setLength(0);
                }
            }
        }
        if (!number.isEmpty()) {
            sum += Integer.parseInt(number.toString());
        }
        return sum;
    }
}
