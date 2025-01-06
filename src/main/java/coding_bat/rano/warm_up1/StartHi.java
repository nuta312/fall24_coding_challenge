package coding_bat.rano.warm_up1;

public class StartHi {
    public boolean startHi(String str) {
        if (str.length() <2){
            return false;
        }
        String  t = str.substring(0,2);
        if (t.equals("hi")){
            return true;
        }
        else{
            return false;
        }
    }
}
