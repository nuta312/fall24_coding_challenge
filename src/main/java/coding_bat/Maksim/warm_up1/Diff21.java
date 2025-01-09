package coding_bat.Maksim.warm_up1;

public class Diff21 {
    public int diff21(int n) {
        if (n > 21) {
            return 2 * (n - 21); // Double the difference if n is over 21
        } else {
            return 21 - n; // Absolute difference if n is 21 or less
        }
    }
}
