package coding_bat.aidin.warm_up1;

public class close10 {
    public int close10(int a, int b) {
        int diffA = Math.abs(a - 10);
        int diffB = Math.abs(b - 10);

        if (diffA == diffB){
            return 0;
        } else if (diffA < diffB){
            return a;
        }else{
            return b;
        }


    }

}
