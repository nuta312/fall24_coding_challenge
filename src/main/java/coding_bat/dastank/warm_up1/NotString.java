package coding_bat.dastank.warm_up1;

public class NotString {
    public String notString(String str) {
        if(str.startsWith("not")){
            return str;
        }else{
            return "not "+str;
        }
    }
}
