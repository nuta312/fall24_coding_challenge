package coding_bat.aiza.string1;

public class lastTwo {
    public String lastTwo(String str) {
        if (str.length()<2){
            return str;
        }
        String begin = str.substring(0,str.length()-2);
        String lastTwo = str.substring(str.length()-2);
        String swapped = lastTwo.charAt(1) + "" + lastTwo.charAt(0);
        return begin + swapped;
    }
}
