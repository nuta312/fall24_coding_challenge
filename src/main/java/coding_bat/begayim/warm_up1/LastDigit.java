package coding_bat.begayim.warm_up1;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        if ((a % 10) == 7 && (b % 10) == 7){
            return true;
        }

        if ((a % 10) == 4 && (b % 10) == 4){
            return true;
        }

        if ((a % 10) == 3 && (b % 10) == 3){
            return true;
        }

        if ((a % 10) == 0 && (b % 10) == 0){
            return true;
        }
        return false;
    }

}
