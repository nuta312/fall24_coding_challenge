package coding_bat.akylai.logic_1;

public class WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles) {
            if (die1 == 6 && die2 == 6) {
                return die2 + 1;
            } else if (die1 == die2){
                return die1+die2+1;
            } else{
                return die1 + die2;
            }
        }
        return die1+die2;
    }
}
