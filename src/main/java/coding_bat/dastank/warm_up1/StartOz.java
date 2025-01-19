package coding_bat.dastank.warm_up1;

public class StartOz {
    public String startOz(String str) {
        if(str.equals("")){
            return "";
        }
        if(str.equals("o")){
            return str;
        }
        if(str.substring(0,1).contains("o")&&str.substring(1,2).contains("z")){
            return "oz";
        }else if(str.substring(1,2).contains("z")){
            return "z";
        }else if(str.substring(0,1).contains("o")){
            return "o";
        }else{
            return "";
        }
    }
}
