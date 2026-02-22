package coding_bat.delnura.Functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class addStar {
    public List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(s -> s + "*")  // добавление '*' к каждой строке
                .collect(Collectors.toList());
    }
}
