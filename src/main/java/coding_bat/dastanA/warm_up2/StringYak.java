package coding_bat.dastanA.warm_up2;

public class StringYak {
    public String stringYak(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // Проверяем, является ли текущий символ 'y' и следующие два символа соответствуют шаблону
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                // Пропускаем "yak"
                i += 2; // Пропускаем также символ между 'y' и 'k'
            } else {
                result.append(str.charAt(i)); // Добавляем символ в результат
            }
        }
        return result.toString();
    }
}
