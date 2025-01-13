package coding_bat.akylai.logic_2;

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        if(goal >= 5){
            if(goal/5 >= big){
                goal-= big * 5;
            }else{
                goal = goal % 5;
            }
        }
        if(goal <= small) return goal;
        return -1;
    }
}
