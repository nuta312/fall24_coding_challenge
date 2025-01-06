package coding_bat.dastank.warm_up2;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int c=0;
        int min = Math.min(a.length(),b.length());
        for(int i = 0; i<min-1;i++){
            if(b.substring(i,i+2).equals(a.substring(i,i+2))){
                c++;
            }
        }return c;
    }
}
