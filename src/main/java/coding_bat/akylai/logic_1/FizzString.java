package coding_bat.akylai.logic_1;

public class FizzString {
    public String fizzString(String str) {
        if (str.toLowerCase().startsWith("f") && str.toLowerCase().endsWith("b")) {
            return "FizzBuzz";
        }
        if (str.toLowerCase().startsWith("f")) {
            return "Fizz";
        }
        if (str.toLowerCase().endsWith("b")) {
            return "Buzz";
        }
        return str;
    }
}
