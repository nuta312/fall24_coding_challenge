package coding_bat.aiza.warmup_2;

public class doubleX {
    public static boolean  doubleX(String str) {
        int firstX = str.indexOf('x');
        if (firstX == -1 || firstX == str.length()-1){
            return false;
        }
        return str.charAt(firstX + 1) == 'x';
    }
}
