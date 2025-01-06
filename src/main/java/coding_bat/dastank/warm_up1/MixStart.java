package coding_bat.dastank.warm_up1;

public class MixStart {
    public boolean mixStart(String str) {
        return (str.length()>=3&&str.substring(0,3).contains("ix"));
    }
}
