package coding_bat.aiza.logic_1;

public class nearTen {
    public boolean nearTen(int num) {
        return num % 10 == 0 || num % 10 == 1 || num % 10 == 2 || num % 10 == 8 || num % 10 == 9;
    }
}
