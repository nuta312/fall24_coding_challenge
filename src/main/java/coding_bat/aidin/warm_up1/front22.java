package coding_bat.aidin.warm_up1;

public class front22 {
    public String front22(String str) {
        String prefixSuffix;
        if (str.length() <2){
        }else {
            String temp = str.substring(0 , 2);
            return temp + str + temp;
        }
        return str + str + str;


    }
}
