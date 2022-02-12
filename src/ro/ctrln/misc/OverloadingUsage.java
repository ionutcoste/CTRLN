package ro.ctrln.misc;

import ro.ctrln.inheritance.FalconHeavy;

public class OverloadingUsage {

    public static void main(String[] args) {
        FalconHeavy falconHeavy = new FalconHeavy();

        falconHeavy.escapeProcedure(10);
        System.out.println("****************************");
        falconHeavy.escapeProcedure(3,true);
        System.out.println("_______________________________________");
        falconHeavy.escapeProcedure();
        System.out.println("############################################");
        falconHeavy.escapeProcedure(false, false, true);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(falconHeavy.escapeProcedure(false));
    }
}
