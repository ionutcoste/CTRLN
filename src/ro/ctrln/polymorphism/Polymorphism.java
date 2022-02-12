package ro.ctrln.polymorphism;

import ro.ctrln.inheritance.*;

public class Polymorphism {
    public static void main(String[] args) {
        Battleship battleship =  new Battleship();
        ImperialStarDestroyer imperialStarDestroyer =  new ImperialStarDestroyer();
        TieFighter tieFighter = new TieFighter();
        XWingStarFighter xWingStarFighter = new XWingStarFighter();
        FalconHeavy falconHeavy = new FalconHeavy();

        System.out.println("battleship instance of Object: " + (battleship instanceof Object));
        System.out.println("battleship instance of Battleship: " + (battleship instanceof Battleship));
        System.out.println("battleship instance of ImperialStarDestroyer: " + (battleship instanceof ImperialStarDestroyer));
        System.out.println("battleship instance of FalconHeavy: " + (battleship instanceof FalconHeavy));


        System.out.println("imperialStarDestroyer instance of Object: " + (imperialStarDestroyer instanceof Object));
        System.out.println("imperialStarDestroyer instance of ImperialStarDestroyer: " + (imperialStarDestroyer instanceof ImperialStarDestroyer));
        System.out.println("imperialStarDestroyer instance of Battleship: " + (imperialStarDestroyer instanceof Battleship));
        //System.out.println("imperialStarDestroyer instance of TieFighter: " + (imperialStarDestroyer instanceof TieFighter));

        System.out.println("tieFighter instance of Object: " + (tieFighter instanceof Object));
        System.out.println("tieFighter instance of TieFighter: " + (tieFighter instanceof TieFighter));
        System.out.println("tieFighter instance of Starship: " + (tieFighter instanceof Starship));
        //System.out.println("tieFighter instance of ImperialStarDestroyer: " + (tieFighter instanceof ImperialStarDestroyer));

        System.out.println("xWingStarFighter instance of Object: " + (xWingStarFighter instanceof Object));
        System.out.println("xWingStarFighter instance of XWingStarFighter: " + (xWingStarFighter instanceof XWingStarFighter));
        System.out.println("xWingStarFighter instance of Starship: " + (xWingStarFighter instanceof Starship));
        System.out.println("xWingStarFighter instance of Rocket: " + (xWingStarFighter instanceof Rocket));

        System.out.println("falconHeavy instance of Object: " + (falconHeavy instanceof Object));
        System.out.println("falconHeavy instance of FaconHeavy: " + (falconHeavy instanceof FalconHeavy));
        System.out.println("falconHeavy instance of Battleship: " + (falconHeavy instanceof Battleship));
        System.out.println("falconHeavy instance of Starship: " + (falconHeavy instanceof Starship));
        System.out.println("falconHeavy instance of Rocket: " + (falconHeavy instanceof Rocket));

        //System.out.println("falconHeavy instance of TieFighter: " + (falconHeavy instanceof TieFighter));


    }
}
