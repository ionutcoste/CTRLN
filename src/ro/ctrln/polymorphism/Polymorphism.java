package ro.ctrln.polymorphism;

import ro.ctrln.util.ProjectUtils;
import ro.ctrln.inheritance.*;

public class Polymorphism {
    public static void main(String[] args) {
        Battleship battleship =  new Battleship();
        ImperialStarDestroyer imperialStarDestroyer =  new ImperialStarDestroyer();
        TieFighter tieFighter = new TieFighter();
        XWingStarFighter xWingStarFighter = new XWingStarFighter();
        FalconHeavy falconHeavy = new FalconHeavy();

        ProjectUtils.printMessage("battleship instance of Object: " + (battleship instanceof Object));
        ProjectUtils.printMessage("battleship instance of Battleship: " + (battleship instanceof Battleship));
        ProjectUtils.printMessage("battleship instance of ImperialStarDestroyer: " + (battleship instanceof ImperialStarDestroyer));
        ProjectUtils.printMessage("battleship instance of FalconHeavy: " + (battleship instanceof FalconHeavy));


        ProjectUtils.printMessage("imperialStarDestroyer instance of Object: " + (imperialStarDestroyer instanceof Object));
        ProjectUtils.printMessage("imperialStarDestroyer instance of ImperialStarDestroyer: " + (imperialStarDestroyer instanceof ImperialStarDestroyer));
        ProjectUtils.printMessage("imperialStarDestroyer instance of Battleship: " + (imperialStarDestroyer instanceof Battleship));
        //ProjectUtils.printMessage("imperialStarDestroyer instance of TieFighter: " + (imperialStarDestroyer instanceof TieFighter));

        ProjectUtils.printMessage("tieFighter instance of Object: " + (tieFighter instanceof Object));
        ProjectUtils.printMessage("tieFighter instance of TieFighter: " + (tieFighter instanceof TieFighter));
        ProjectUtils.printMessage("tieFighter instance of Starship: " + (tieFighter instanceof Starship));
        //ProjectUtils.printMessage("tieFighter instance of ImperialStarDestroyer: " + (tieFighter instanceof ImperialStarDestroyer));

        ProjectUtils.printMessage("xWingStarFighter instance of Object: " + (xWingStarFighter instanceof Object));
        ProjectUtils.printMessage("xWingStarFighter instance of XWingStarFighter: " + (xWingStarFighter instanceof XWingStarFighter));
        ProjectUtils.printMessage("xWingStarFighter instance of Starship: " + (xWingStarFighter instanceof Starship));
        ProjectUtils.printMessage("xWingStarFighter instance of Rocket: " + (xWingStarFighter instanceof Rocket));

        ProjectUtils.printMessage("falconHeavy instance of Object: " + (falconHeavy instanceof Object));
        ProjectUtils.printMessage("falconHeavy instance of FaconHeavy: " + (falconHeavy instanceof FalconHeavy));
        ProjectUtils.printMessage("falconHeavy instance of Battleship: " + (falconHeavy instanceof Battleship));
        ProjectUtils.printMessage("falconHeavy instance of Starship: " + (falconHeavy instanceof Starship));
        ProjectUtils.printMessage("falconHeavy instance of Rocket: " + (falconHeavy instanceof Rocket));

        //ProjectUtils.printMessage("falconHeavy instance of TieFighter: " + (falconHeavy instanceof TieFighter));


    }
}
