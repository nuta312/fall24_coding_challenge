package coding_bat.aguKanybaeva.warm_up2;

public class frontTimes {
    public String frontTimes(String str, int n) {
        String temp = "";
        String s= "";
        if(str.length() >=3 ) {
            s = str.substring(0,3);
        }
        else {
            s = str;
        }
        for(int i=0; i < n; i++) {
            temp = temp + s;
        }

        return temp;

    }
}
