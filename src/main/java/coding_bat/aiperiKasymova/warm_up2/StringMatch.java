package coding_bat.aiperiKasymova.warm_up2;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int length = Math.min( a.length(), b.length());
        int count = 0;

        for(int i = 0; i < length - 1; i ++){
            String subA = a.substring( i, i + 2);
            String subB = b.substring( i, i + 2);
            if(subA.equals(subB)){
                count++;
            }
        }
        return count;
    }

}
