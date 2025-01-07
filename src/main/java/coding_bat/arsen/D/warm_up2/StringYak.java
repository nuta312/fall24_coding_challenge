package coding_bat.arsen.D.warm_up2;

public class StringYak {
    public String stringYak(String str) {
        if(str.contains("yak")){
            str=str.replaceAll("yak","");
        }return str;
    }
}
