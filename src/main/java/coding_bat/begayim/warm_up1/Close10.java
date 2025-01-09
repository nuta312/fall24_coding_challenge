package coding_bat.begayim.warm_up1;

public class Close10 {
    public int close10(int a, int b) {

        int numA = Math.abs (a - 10);
        int numB = Math.abs (b - 10);

        if (numA < numB){
            return a;
        }
        if (numA > numB){
            return b;
        }return 0;
    }

}
