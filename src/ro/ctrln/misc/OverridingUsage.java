package ro.ctrln.misc;

import ro.ctrln.inheritance.Battleship;
import ro.ctrln.inheritance.FalconHeavy;
import ro.ctrln.util.ProjectUtils;

public class OverridingUsage {
    public static void main(String[] args) {
        Battleship battleship = new Battleship();
        battleship.escapeProcedure(3);
        ProjectUtils.printMessage("----------------------------------------");
        FalconHeavy falconHeavy =  new FalconHeavy();
        falconHeavy.escapeProcedure(10);
    }
}
