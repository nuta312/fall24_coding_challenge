package coding_bat.arsen.D.warm_up2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        if (str.length()>=3){
            String str1 = str.substring(0,3);
            for(int a=0;a <n; a++){
                sb.append(str1);
            }
        } else{
            for(int a =0;a<n;a++){
                sb.append(str);


            }
            return sb.toString();
        }
        return sb.toString();
    }
}
