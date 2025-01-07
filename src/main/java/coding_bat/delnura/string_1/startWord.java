package coding_bat.delnura.string_1;

public class startWord {
    public String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }

        // Если строка состоит из одного символа, возвращаем её как есть, если слово не совпадает
        if (str.length() == 1) {
            return str;
        }

        // Проверяем, совпадает ли подстрока начиная с первого символа
        if (str.substring(0, word.length()).equals(word)) {
            return word;
        }

        // Проверяем, совпадает ли префикс начиная с 2-го символа строки
        if (str.length() > 1 && str.substring(1, word.length()).equals(word.substring(1))) {
            return str.substring(0, word.length());
        }

        // Если ничего не совпало, возвращаем пустую строку
        return "";
    }

}
