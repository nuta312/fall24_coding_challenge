package coding_bat.dastank.warm_up1;

public class FrontBack {
    public String frontBack(String str) {
        if(str.length()>1){
            char ch= str.charAt(0);
            char ch1= str.charAt(str.length()-1);
            return ch1 + str.substring(1,str.length()-1) + ch;
        }else{
            return str;
        }
    }
}
