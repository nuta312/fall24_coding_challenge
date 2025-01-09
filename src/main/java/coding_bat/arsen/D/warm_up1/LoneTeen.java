package coding_bat.arsen.D.warm_up1;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        
        boolean alsT = (a >= 13 && a <=19);
        boolean blsT = (b >= 13 && b <=19);
        return (alsT && !blsT) || (!alsT && blsT);
    }
}
