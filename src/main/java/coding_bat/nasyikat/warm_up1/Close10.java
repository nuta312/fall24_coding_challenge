package coding_bat.nasyikat.warm_up1;

public class Close10 {
    public int close10(int a, int b) {
        int num1 = Math.abs(a - 10);
        int num2 = Math.abs(b - 10);
        if (num1 == num2)
            return 0;
        else if (num1 > num2)
            return b;
        else
            return a;
    }
}
