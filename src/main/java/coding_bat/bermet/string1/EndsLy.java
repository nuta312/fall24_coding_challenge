package coding_bat.bermet.string1;

public class EndsLy {
    public boolean endsLy(String str) {
        if (str.length() <= 1){
            return false;
        }
        String result = str.substring(str.length()-2, str.length());
        if (result.contains("ly")){
            return true;
        }else{
            return false;
        }
    }
}
