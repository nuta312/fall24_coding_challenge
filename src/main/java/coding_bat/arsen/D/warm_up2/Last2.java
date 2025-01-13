package coding_bat.arsen.D.warm_up2;

public class Last2 {
    public int last2(String str) {
        int count=0;
        if(str.length()>2){
            String str1 = str.substring(str.length()-2,str.length());
            for(int a = 0; a<str.length()-2;a++){
                String str2 = str.substring(a,a+2);
                if(str1.equals(str2)){
                    count++;
                }

            }
            return count;
        }  else{
            return count;
        }
    }
}
