package coding_bat.dastank.warm_up1;

public class EndUp {
    public String endUp(String str) {
        if(str.length()>3){
            String str1 = str.substring(str.length()-3).toUpperCase();
            return str.substring(0,str.length()-3)+str1;
        }else{
            return str.toUpperCase();
        }
    }
}
