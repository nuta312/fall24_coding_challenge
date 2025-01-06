package coding_bat.dastank.warm_up1;

public class Front22 {
    public String front22(String str) {
        if(str.length()>1){
            String str1 = str.substring(0,2);
            return str1+str+str1;
        }else{
            return str + str + str;
        }}
}
