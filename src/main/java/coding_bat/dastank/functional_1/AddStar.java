package coding_bat.dastank.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public List<String> addStar(List<String> strings) {
        return strings.stream().map(n->n+"*").toList();
    }
}