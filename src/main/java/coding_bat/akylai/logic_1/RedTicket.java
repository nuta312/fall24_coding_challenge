package coding_bat.akylai.logic_1;

public class RedTicket {
    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2){
            return 10;
        } else if (a >= 0 && a < 2 && a == b && a == c) {
            return 5;
        } else if (b == c || a != b && a != c && b != c){
            return 1;
        }else {
            return 0;
        }
    }
}
