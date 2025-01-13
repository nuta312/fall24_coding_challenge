package coding_bat.dastanA.string_1;

public class WithoutX2 {
    public static String withoutX2(String str) {
        if (str.length() > 1 && str.charAt(1) == 'x') {
            str = str.substring(0,1).concat(str.substring(2));
        }
        if (str.length() >= 1 && str.startsWith("x")) {
            str = str.substring(1);
        }
        if (str.length() >= 1 && str.startsWith("x")) {
            str = str.substring(1);
        }
        return str;
    }
}
