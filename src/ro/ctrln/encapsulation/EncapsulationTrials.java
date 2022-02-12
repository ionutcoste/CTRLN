package ro.ctrln.encapsulation;

import ro.ctrln.inheritance.FalconHeavy;

// 1.Metodele publice dintr-o superclasa (clasa parinte) trebuie declarate tot publice in subclase
// 2.Metodele protected intr-o superclasa pot fi declarate fie public fie protected
// 3.Proprietatile declarate public sau protected in superclasa sunt mostenite in clasele copil, mostenirea doar pe un nivel
// 4. Metodele si proprietatile private nu se pot mosteni deloc
// 5. Clasele declarate finale nu pot fi mostenite
// 6. Clasele pot fi declarate private atunci cand sunt clase interioare
public class EncapsulationTrials {
    public static void main(String[] args) {
        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("FalconHeavy encapsulation");
        falconHeavy.escapeProcedure(3);
    }
}
