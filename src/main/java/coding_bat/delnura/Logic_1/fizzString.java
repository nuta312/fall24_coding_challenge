package coding_bat.delnura.Logic_1;

public class fizzString {
    public String fizzString(String str) {
        boolean fizz = false;
        boolean buzz = false;

        if(str.length() > 0){
            fizz = str.substring(0,1).equals("f");
            buzz = str.substring(str.length()-1, str.length()).equals("b");
        }

        if(fizz && buzz){
            return "FizzBuzz";
        }
        else if(fizz){
            return "Fizz";
        }
        else if(buzz){
            return "Buzz";
        }
        else {
            return str;
        }
    }

}
