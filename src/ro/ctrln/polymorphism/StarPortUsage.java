package ro.ctrln.polymorphism;

import ro.ctrln.inheritance.*;

public class StarPortUsage {

    public static void main(String[] args) {
        FalconHeavy falconHeavy = new FalconHeavy();
        XWingStarFighter xWingStarFighter = new XWingStarFighter();
        TieFighter tieFighter = new TieFighter();

        StarPort starPort = new StarPort();

        falconHeavy.setBattleshipName("FH the great");
        falconHeavy.setBattleshipCapacity(100);
        falconHeavy.setDestination("home");
        starPort.setStarship(falconHeavy);
        starPort.flyToSpace();
        System.out.println(starPort);

        starPort.setStarship(xWingStarFighter);
        starPort.flyToSpace();

        starPort.setStarship(tieFighter);
        starPort.flyToSpace();

        Starship starshipOne = new FalconHeavy();
        Starship starshipTwo = new XWingStarFighter();
        Starship starshipThree = new TieFighter();
        //Starship starshipFour = new Battleship();
        Battleship battleshipOne = new FalconHeavy();
        Battleship battleshipTwo = new ImperialStarDestroyer();

        //starPort.setStarship(battleshipOne);  //eroare de compilare, nu este starship

        //FaconHeavy faconHeavy1 = new Battleship(); //eroare de compilare, proprietati incomplete deci nu se poate
                        //nu se poate face cast de un obiect copil la un obiect parinte,
                        //obiectul copil falconheavy1(de tip falconheavy) ar trebui sa primeasca proprietati de la Battleship
                        // dar battleship are mai putine proprietati (falconheavy extends battleship) deci s-ar aduce obiect cu
                        // informatii incomplete, invers se poate: obiectul ar fi complet, dar unele informatii nu s-ar aduce

        starPort.setStarship(starshipOne);
        starPort.flyToSpace();

        starPort.setStarship(starshipTwo);
        starPort.flyToSpace();

        starPort.setStarship(starshipThree);
        starPort.flyToSpace();
    }
}
