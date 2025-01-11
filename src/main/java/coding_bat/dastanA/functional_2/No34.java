package coding_bat.dastanA.functional_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No34 {
    public static List<String> no34_1(List<String> strings) {
        List<String> omitting34 = strings.stream()
                                .filter(str -> str.length() != 3 && str.length() != 4)
                                .collect(Collectors.toList());
        return omitting34;
    }

    public List<String> no34_2(List<String> str) {
        str.removeIf(n -> n.length() == 3 || n.length() == 4);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(no34_1(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))));
        System.out.println(no34_1(new ArrayList<>(Arrays.asList("a", "bb", "ccc", "dddd"))));
        System.out.println(no34_1(new ArrayList<>(Arrays.asList("ccc", "dddd", "apple"))));

    }

}
