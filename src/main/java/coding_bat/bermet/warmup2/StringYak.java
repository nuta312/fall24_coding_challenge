package coding_bat.bermet.warmup2;

public class StringYak {
    public String stringYak(String str) {
        if (str.contains("yak")){
            str =  str.replace("yak", "");
        }
        return str;

    }
}
