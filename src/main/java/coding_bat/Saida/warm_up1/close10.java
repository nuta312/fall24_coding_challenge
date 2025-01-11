package coding_bat.Saida.warm_up1;

public class close10 {
    public int close10(int a, int b) {
        int diffA = Math.abs(a - 10);
        int diffB = Math.abs(b - 10);
        return (diffA < diffB) ? a: (diffB < diffA) ? b: 0;

    }
}
