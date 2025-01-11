package coding_bat.akylai.string_3;

public class CountYZ {
    public int countYZ(String str) {
        int count = 0;
        String [] str1 = str.split("[,?.!;:()\\[\\]{}\\-\\s0-9]+");
        for (int i = 0; i < str1.length; i++){
            if(str1[i].toLowerCase().endsWith("y") || str1[i].toLowerCase().endsWith("z")){
                count++;
            }
        }
        return count;
    }
}
