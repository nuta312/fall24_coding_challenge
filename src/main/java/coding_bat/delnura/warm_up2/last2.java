package coding_bat.delnura.warm_up2;

public class last2 {
    public int last2(String str) {
        if (str.length() < 2){
            return 0;
        }
        String Start = "" ;
        String End = str.substring(str.length()-2);
        int count = 0;
        for( int i = 0; i < str.length() -2; i++){
            Start = str.substring(i,i + 2);
            if(Start.equals(End)){
                count++;
            }

        } return count++;
    }
}
