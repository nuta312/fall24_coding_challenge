package coding_bat.aiza.string1;

public class nTwice {
    public String nTwice(String str, int n) {
        String part1 = str.substring(0,n);
        String part2 = str.substring(str.length()-n);
        return  part1 + part2;
    }
}
