package coding_bat.Murat.Logic1;

public class Love6 {
    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) return true;
        else if (a + b == 6) return true;
        else if (Math.abs(a - b) == 6) return true;
        return false;
    }
}