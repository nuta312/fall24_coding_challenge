package coding_bat.delnura.string_1;

public class withoutX {
    public String withoutX(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        // Проверяем, если последний символ 'x', удаляем его
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
}
