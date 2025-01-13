package coding_bat.gera.functional.functional_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public List<String> addStar(List<String> strings) {
       return strings.stream()
               .map(str -> str + "*")
               .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        AddStar addStar = new AddStar();
        List<String> str = Arrays.asList("new", "java","Coding bat");
        List<String> str2 = addStar.addStar(str);

        System.out.println(str2);

    }
}
