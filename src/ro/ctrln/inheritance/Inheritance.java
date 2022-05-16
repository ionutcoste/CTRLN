package ro.ctrln.inheritance;
import ro.ctrln.util.ProjectUtils;

public class Inheritance {

    public static void main(String[] args) {

        Battleship battleship = new Battleship();
        battleship.setBattleshipName("Terran Battleship");
        battleship.setBattleshipCapacity(20000);
        ProjectUtils.printMessage("Battleship is:" + battleship);

        ImperialStarDestroyer imperialStarDestroyer = new ImperialStarDestroyer();
        imperialStarDestroyer.setBattleshipName("Imperial Star Destroyer");
        imperialStarDestroyer.setBattleshipCapacity(30000);
        imperialStarDestroyer.setNumberOfDecks(30);
        ProjectUtils.printMessage("Imperial star destroyer is:" + imperialStarDestroyer);

        //Starship starship = new Starship()

        XWingStarFighter xWingStarFighter = new XWingStarFighter();
        xWingStarFighter.setStarshipDestination("base");
        ProjectUtils.printMessage("Velocity xwingfighter : "+ xWingStarFighter.computeWarpSpeed(3,1000));
        ProjectUtils.printMessage("XwingStar Fighter is: " + xWingStarFighter);

        TieFighter tieFighter = new TieFighter();
        tieFighter.setStarshipDestination("base");
        ProjectUtils.printMessage("velocity for tiefighter is: " + tieFighter.computeWarpSpeed(3,1000));
        ProjectUtils.printMessage("Tie fighter is: " + tieFighter);

        xWingStarFighter.warp();
        tieFighter.warp();
        ProjectUtils.printMessage("TieFighter is: " + tieFighter);

        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("FalconHeavy");
        falconHeavy.setBattleshipCapacity(10);
        falconHeavy.setDestination("Moon");
        ProjectUtils.printMessage("Falcon heavy is: " + falconHeavy);

        falconHeavy.setStarshipDestination("Mars");
        ProjectUtils.printMessage("Falcon heavy is:" + falconHeavy);
        falconHeavy.launchCountdown(10);
    }


}
