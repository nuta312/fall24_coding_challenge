package coding_bat.delnura.Functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class noYY {
    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(s -> s + "y")  // Добавляем 'y' в конец каждой строки
                .filter(s -> !s.contains("yy"))  // Исключаем строки, содержащие "yy"
                .collect(Collectors.toList());
    }
}
