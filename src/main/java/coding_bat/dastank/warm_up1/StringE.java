package coding_bat.dastank.warm_up1;

public class StringE {
    public boolean stringE(String str) {
        return (str.matches("(.*e.*){1,2}")&& !str.matches("(.*e.*){4}"));
    }
}
