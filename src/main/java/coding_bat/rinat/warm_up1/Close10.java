package coding_bat.rinat.warm_up1;

public class Close10 {public int close10(int a, int b) {
    int raz1 = 10 - a;
    int raz2 = 10 - b;

    if (raz1 <= 0 && raz2 <= 0) {
        raz2 = raz2 * (-1);
        raz1 = raz1 * (-1);

        if (raz1 < raz2) {
            return a;
        } else if (raz1 > raz2) {
            return b;
        } else {
            return 0;
        }
    } else if (raz1 <= 0 && raz2 >= 0) {
        raz1 = raz1 * (-1);
        if (raz1 < raz2) {
            return a;
        } else if (raz1 > raz2) {
            return b;
        } else {
            return 0;
        }
    } else if (raz1 >= 0 && raz2 <= 0) {
        raz2 = raz2 * (-1);
        if (raz1 < raz2) {
            return a;
        } else if (raz1 > raz2) {
            return b;
        } else {
            return 0;
        }

    } else {
        if (raz1 < raz2) {
            return a;
        } else if (raz1 > raz2) {
            return b;
        } else {
            return 0;
        }
    }
}

}
