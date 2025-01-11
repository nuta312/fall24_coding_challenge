package coding_bat.akylai.functional_2;

import java.util.Iterator;
import java.util.List;

public class No9 {
    public List<Integer> no9(List<Integer> nums) {
        Iterator<Integer> list = nums.iterator();
        while(list.hasNext()){
            if (list.next() % 10 == 9){
                list.remove();
            }
        }
        return nums;
    }

}
