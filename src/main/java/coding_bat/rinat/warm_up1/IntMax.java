package coding_bat.rinat.warm_up1;

public class IntMax {public int intMax(int a, int b, int c) {
    int max = 0;
    if(a >= b && a >= c){
        max = a;
        return max;
    } else if (b >= a && b >= c) {
        max = b;
        return max;
    } else {
        max = c;
    }

    return max;
}

}
