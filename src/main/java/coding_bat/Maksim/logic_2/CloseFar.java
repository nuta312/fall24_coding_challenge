package coding_bat.Maksim.logic_2;

public class CloseFar {
    public boolean closeFar(int a, int b, int c) {
        return (Math.abs(b - a) <= 1 && Math.abs(c - b) >= 2 && Math.abs(c - a) >= 2) ||
                (Math.abs(c - a) <= 1 && Math.abs(b - c) >= 2 && Math.abs(b - a) >= 2);
    }
}
