package coding_bat.delnura.warm_up2;

public class stringX {
    public String stringX(String str) {
        if (str == null || str.length() == 0){
            return str;
        }
        if (str.length() == 1){
            return str;
        }

        String start = str.substring(0,1);//первый символ
        String end = str.substring(str.length() -1);//последний символ

        String middle = str.substring(1,str.length()-1).replace("x","");

        return start + middle + end;
    }
}
