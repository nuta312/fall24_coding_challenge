package coding_bat.Maksim.warm_up2;

public class StringSplosion {
    public String stringSplosion(String str) {

        String new1 = "";
        for (int i=0; i<str.length(); i++){
            new1+=str.substring(0,i+1);
        }
        return new1;

    }
}
