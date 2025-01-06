package coding_bat.nasyikat.warm_up2;

public class StringBits {
    public String stringBits(String str) {
        StringBuilder result = new StringBuilder();

        for (int i =0; i < str.length(); i +=2) { // i+= означает что он добавляет 2 и i в цикле увеличивается в двое
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
