package coding_bat.delnura.warm_up2;

public class stringMatch {
    public int stringMatch(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length()-1 && i < b.length()-1;i++){
            String subA = a.substring(i,i + 2);
            String subB = b.substring(i,i + 2);

            if (subA.equals(subB)){
                count++;
            }
        }
        return count;
    }
}
