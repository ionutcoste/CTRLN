package ro.ctrln.inheritance;

public class Inheritance {

    public static void main(String[] args) {

        Battleship battleship = new Battleship();
        battleship.setBattleshipName("Terran Battleship");
        battleship.setBattleshipCapacity(20000);
        System.out.println("Battleship is:" + battleship);

        ImperialStarDestroyer imperialStarDestroyer = new ImperialStarDestroyer();
        imperialStarDestroyer.setBattleshipName("Imperial Star Destroyer");
        imperialStarDestroyer.setBattleshipCapacity(30000);
        imperialStarDestroyer.setNumberOfDecks(30);
        System.out.println("Imperial star destroyer is:" + imperialStarDestroyer);

        //Starship starship = new Starship()

        XWingStarFighter xWingStarFighter = new XWingStarFighter();
        xWingStarFighter.setStarshipDestination("base");
        System.out.println("Velocity xwingfighter : "+ xWingStarFighter.computeWarpSpeed(3,1000));
        System.out.println("XwingStar Fighter is: " + xWingStarFighter);

        TieFighter tieFighter = new TieFighter();
        tieFighter.setStarshipDestination("base");
        System.out.println("velocity for tiefighter is: " + tieFighter.computeWarpSpeed(3,1000));
        System.out.println("Tie fighter is: " + tieFighter);

        xWingStarFighter.warp();
        tieFighter.warp();
        System.out.println("TieFighter is: " + tieFighter);

        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("FalconHeavy");
        falconHeavy.setBattleshipCapacity(10);
        falconHeavy.setDestination("Moon");
        System.out.println("Falcon heavy is: " + falconHeavy);

        falconHeavy.setStarshipDestination("Mars");
        System.out.println("Falcon heavy is:" + falconHeavy);
        falconHeavy.launchCountdown(10);
    }


}
