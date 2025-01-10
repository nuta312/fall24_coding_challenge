package coding_bat.nurlanwarm_up5;

public class Warmup_1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) return true;
else return false;
//        return  (!weekday|| vacation ) ;

    }

    public static void main(String[] args) {
        Warmup_1 warmup1 = new Warmup_1();
        System.out.println(warmup1.sleepIn(false, true));
    }
}
