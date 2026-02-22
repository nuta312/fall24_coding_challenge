package coding_bat.gera.functional.functional_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(str -> "y" + str + "y")
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        MoreY more = new MoreY();

        List<String> str = Arrays.asList("hey","2","str");
        List<String> ans = more.moreY(str);

        System.out.println(ans);
    }
}
