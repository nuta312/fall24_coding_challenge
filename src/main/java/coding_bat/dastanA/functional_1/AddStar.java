package coding_bat.dastanA.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public List<String> addStar1(List<String> strings) {
        List<String> addStar = strings.stream()
                                .map(n -> n + "*")
                                .collect(Collectors.toList());

        return strings;
    }


    public List<String> addStar2(List<String> strings) {
        strings.replaceAll(n -> n + "*");
        return strings;
    }
}
