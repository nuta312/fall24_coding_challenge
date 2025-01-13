package coding_bat.bermet.warmup1;

public class StartHi {
    public boolean startHi(String str) {
        if (str.contains("hi") && str.length() <= 2){
            return true;
        } else if (str.contains("hi ")){
            return true;
        } else {
            return false;
        }
    }
}
