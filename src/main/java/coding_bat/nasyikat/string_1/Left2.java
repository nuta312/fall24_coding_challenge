package coding_bat.nasyikat.string_1;

public class Left2 {
    public String left2(String str) {
        String str1 = str.substring(0,2);
        String str2 = str.substring(2,str.length());
        return str2.concat(str1);
    }
}
