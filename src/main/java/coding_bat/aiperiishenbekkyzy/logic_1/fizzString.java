package coding_bat.aiperiishenbekkyzy.logic_1;

public class fizzString {
    public String fizzString(String str) {
        boolean fizz = str.charAt(0) == 'f';
        boolean buzz = str.charAt(str.length() - 1) == 'b';
        if (fizz && buzz) return "FizzBuzz";
        if (fizz) return "Fizz";
        if (buzz) return "Buzz";
        return str;

    }
}
