package coding_bat.dastank.warm_up1;

public class DelDel {
    public String delDel(String str) {
        if(str.length()>3&&str.substring(1,4).contains("del")){
            return str.substring(0,1)+str.substring(4);
        }else{
            return str;
        }
    }

}
