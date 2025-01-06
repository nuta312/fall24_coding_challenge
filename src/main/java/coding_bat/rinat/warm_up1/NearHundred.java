package coding_bat.rinat.warm_up1;

public class NearHundred {
    public boolean nearHundred(int n) {
        boolean ANSWER = false;

        if ( n + 10 >= 100 && n - 10 <= 100)

            ANSWER = true;

        else if ( n + 10 >= 200 && n - 10 <=200)

            ANSWER = true;

        return ANSWER;
    }
}
