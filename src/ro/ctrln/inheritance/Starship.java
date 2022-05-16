package ro.ctrln.inheritance;

import java.util.Random;

//interfetele sunt tot clase abstarcte
public interface Starship {

    int FIRST_INT = 1;
    int SECOND_INT = 2;
    final int THIRD_INT =1;  //redundant public static final

    //acestea sunt tot metode abstarcte = trebuie definite in clasa copil
    void warp();  //implicit public

    void setStarshipDestination(String detination);

    double computeWarpSpeed(int warpFactor, int lightYearsToDestination);

    default int productionId(){  //daca  e default in interfata nu mai trebuie definita in clasa care mosteneste/implementeaza
        Random r = new Random();
        return 1+ r.nextInt();
    }
}
