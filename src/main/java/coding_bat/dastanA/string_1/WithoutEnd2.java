package coding_bat.dastanA.string_1;

public class WithoutEnd2 {
    public String withoutEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length()-1);
    }

}
