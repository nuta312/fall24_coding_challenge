package coding_bat.Saida.warm_up1;

public class endUp {
    public String endUp(String str) {
        if (str.length() <= 3){
            return str.toUpperCase();
        } else {
            String beginning = str.substring(0, str.length()-3);
            String ending = str.substring(str.length()-3);
            return beginning + ending.toUpperCase();
        }
    }
}
