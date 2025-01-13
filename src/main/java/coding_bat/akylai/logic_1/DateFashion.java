package coding_bat.akylai.logic_1;

public class DateFashion {
    public int dateFashion(int you, int date) {
        if (you > 0 && you <= 2) {
            if (date > 0 && date <= 2 || date > 7 && date <= 10) {
                return 0;
            } else if (date > 2 && date <= 7) {
                return 0;
            }
        } else if (you > 2 && you <= 7) {
            if (date > 0 && date <= 2) {
                return 0;
            } else if(date > 2 && date <=7){
                return 1;
            } else if (date > 7 && date <= 10) {
                return 2;
            }
        } else if (you > 7 && you <= 10) {
            if (date > 0 && date <= 2) {
                return 0;
            } else if(date > 2 && date <=7 || date > 7 && date <= 10){
                return 2;
            }
        } else {
            return 0;
        }
        return 111111;
    }
}
