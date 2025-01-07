package coding_bat.delnura.string_1;

public class theEnd {
    public String theEnd(String str, boolean front) {
        if (front) {
            return String.valueOf(str.charAt(0)); // возвращаем первый символ
        } else {

            return String.valueOf(str.charAt(str.length() - 1)); // возвращаем последний символ
        }
    }
}
