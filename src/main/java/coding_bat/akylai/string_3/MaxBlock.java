package coding_bat.akylai.string_3;

public class MaxBlock {
    public int maxBlock(String str) {
        int maxCount = 0;
        int count = 1;
        if(str.length() == 0){
            return 0;
        }
        for (int i = 0; i < str.length(); i++){
            if (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
            } else {
                if (count > maxCount){
                    maxCount = count;
                }
                count = 1;
            }
        }
        return maxCount;
    }
}
