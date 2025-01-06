package coding_bat.dastank.warm_up2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        if(str.length()>0){
            for(int a=0; a<n;a++){
                sb.append(str);

            }
        }
        return sb.toString();
    }
}
