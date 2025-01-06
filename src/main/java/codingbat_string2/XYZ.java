package codingbat_string2;

public class XYZ {
    public boolean xyzMiddle(String str) {
        int mid=str.length()/2;

        if (str.length()<3){
            return false;
        }if (str.length()%2!=0){
            if(str.substring(mid-1, mid+2).equals("xyz")){
                return true;
            }return false;
        }else if (str.substring(mid-1, mid+2).equals("xyz")
                || str.substring(mid-2,mid+1).equals("xyz")){
            return true;
        }return false;
    }

}
