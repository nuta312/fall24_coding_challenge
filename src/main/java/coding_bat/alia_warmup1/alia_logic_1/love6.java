package coding_bat.alia_warmup1.alia_logic_1;

public class love6 {
    public boolean love6(int a, int b) {
        if (a==6 || b==6){
            return true;
        } else if (a+b==Math.abs(6) || a-b==Math.abs(6)|| b-a==Math.abs(6))  {
            return true;
        } return false;
    }

}
