package coding_bat.delnura.string_1;

public class withouEnd2 {
    public String withouEnd2(String str) {
        if (str == null || str.length() <= 2) {
            return ""; // Если строка пуста или слишком коротка (1 или 2 символа), возвращаем пустую строку
        }
        return str.substring(1, str.length() - 1); // Возвращаем строку без первого и последнего символа

    }
}
