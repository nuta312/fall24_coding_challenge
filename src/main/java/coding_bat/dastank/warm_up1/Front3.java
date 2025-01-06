package coding_bat.dastank.warm_up1;

public class Front3 {
    public String front3(String str) {
        if(str.length()>3){
            String str1 = str.substring(0,3);
            return str1 + str1 +str1;
        }else{
            return str+str+str;
        }

    }
}
