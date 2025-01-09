package coding_bat.daulet.warm_up2;

public class doubleX {
    boolean doubleX(String str) {
        // Находим первое вхождение символа 'x'
        int firstIndex = str.indexOf('x');

        // Если символ 'x' не найден или 'x' находится в конце строки, возвращаем false
        if (firstIndex == -1 || firstIndex == str.length() - 1) {
            return false;
        }

        // Проверяем, что следующий символ тоже 'x'
        return str.charAt(firstIndex + 1) == 'x';
    }

}
