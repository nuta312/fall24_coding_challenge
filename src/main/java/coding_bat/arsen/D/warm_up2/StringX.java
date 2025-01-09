package coding_bat.arsen.D.warm_up2;

public class StringX {
    public String stringX(String str) {
        if(str.length()>=2){
            if(str.charAt(0)=='x'|| str.charAt(str.length()-1)=='x'){
                char ch=str.charAt(0);
                char ch1 = str.charAt(str.length()-1);
                String str1 =  str.substring(1,str.length()-1).replaceAll("x","");
                return ch+ str1+ch1;
            }else{
                String str2 = str.replaceAll("x","");
                return str2;
            }

        }else{
            return str;
        }}
}
