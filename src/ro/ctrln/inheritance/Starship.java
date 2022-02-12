package ro.ctrln.inheritance;

import java.util.Random;

public interface Starship {

    int FIRST_INT = 1;
    static int SECOND_INT = 2;
     public static final int THIRD_INT =1;  //redundant public static final

    void warp();  //implicit public

    void setStarshipDestination(String detination);

    double computeWarpSpeed(int warpFactor, int lightYearsToDestination);

    default int productionId(){  //daca  e default in interfata nu mai trebuie definita in clasa care mosteneste/implementeaza
        Random r = new Random();
        return 1+ r.nextInt();
    }
}
