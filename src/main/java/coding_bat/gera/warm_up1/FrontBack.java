package coding_bat.gera.warm_up1;

public class FrontBack {
    public String frontBack(String str) {
        int n = str.length();

        if (n <= 1){
            return str;
        }
        String result = str.charAt (n -1)+
                str.substring(1, n-1)+
                str.charAt(0);
        return result;

    }
}
