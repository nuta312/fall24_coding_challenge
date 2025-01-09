package coding_bat.gera.string1;

public class LastTwo {
    public String lastTwo(String str) {
        if (str.length() < 2){
            return str;
        }
        else{
            String all = str.substring(0,str.length()-2);
            char last = str.charAt(str.length()-1);
            char secondLast = str.charAt(str.length()-2);
            return all + last + secondLast ;}
    }
}
