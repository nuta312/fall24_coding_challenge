package coding_bat.dastanA.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class NoX {
    public List<String> noX1(List<String> strings) {
        List<String> withoutX = strings.stream()
                .map(n -> n.replace("x",""))
                .collect(Collectors.toList());
        return strings;
    }


    public List<String> noX2(List<String> strings) {
        strings.replaceAll(n -> removeX(n));
        return strings;
    }

    public String removeX(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != 'x') {
                sb.append(string.charAt(i));
            }
        }
        return sb.toString();
    }

}
