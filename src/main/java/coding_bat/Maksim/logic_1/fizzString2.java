package coding_bat.Maksim.logic_1;

public class fizzString2 {
    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        }
        else if (n % 3 == 0) {
            return "Fizz!";
        }
    else if (n % 5 == 0) {
            return "Buzz!";
        }
        return n + "!";
    }
}
