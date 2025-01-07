package coding_bat.delnura.warm_up1;

public class startHi {
    public boolean startHi(String str) {
        if ( str.length() < 2) {  // Проверка на null и длину строки
            return false;
        }
        String firstTwo = str.substring(0,2);
        if(firstTwo.equals("hi")){
            return true;
        }else{
            return false;
        }
    }
}
