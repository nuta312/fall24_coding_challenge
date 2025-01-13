package coding_bat.Maksim.string_3;

public class SumNumbers {
    public int sumNumbers(String str) {
        int sum = 0;
        String currentNumber = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                currentNumber += ch;
            } else {
                if (!currentNumber.isEmpty()) {
                    sum += Integer.parseInt(currentNumber);
                    currentNumber = "";
                }
            }
        }
        if (!currentNumber.isEmpty()) {
            sum += Integer.parseInt(currentNumber);
        }
        return sum;
    }
}
