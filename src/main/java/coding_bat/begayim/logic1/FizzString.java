package coding_bat.begayim.logic1;

public class FizzString {
    public String fizzString(String str) {
        boolean startsWithF = str.startsWith("f");
        boolean endsWithB = str.endsWith("b");

        if (startsWithF && endsWithB) {
            return "FizzBuzz";
        } else if (startsWithF) {
            return "Fizz";
        } else if (endsWithB) {
            return "Buzz";
        } else {
            return str;
        }
    }
}
