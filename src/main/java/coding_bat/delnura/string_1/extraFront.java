package coding_bat.delnura.string_1;

public class extraFront {
    public String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;  // Повторяем строку 3 раза
        }
        String firstTwo = str.substring(0, 2);

        return firstTwo + firstTwo + firstTwo;

    }

}
