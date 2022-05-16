package ro.ctrln.inheritance;

import ro.ctrln.util.ProjectUtils;

public class FalconHeavy extends Battleship implements Starship,Rocket{

    private String destination;

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override  //adnotare - marcare a faptului ca metoda este suprascrisa
    public String toString() {
        return "FaconHeavy{" +
                "destination='" + destination + '\'' +
                ", battleship name: " + getBattleshipName() +
                ", battleship capacity: " + getBattleshipCapacity() +
                '}';
    }

    @Override
    public void warp() {
        ProjectUtils.printMessage("FalconHeavy doesn't warp. It goes to the moon!");
    }

    @Override
    public void setStarshipDestination(String detination) {
        this.destination=getBattleshipName() + " goes to " + detination;
    }

    @Override
    public double computeWarpSpeed(int warpFactor, int lightYearsToDestination) {
        return 0;
    }


    @Override
    public void launchCountdown(int nr) {
        for (int i=nr;i>=1;i--){
            ProjectUtils.printMessage(i + "...");
        }
    }

    @Override  //aceasta metoda este mostenita din clasa parinte Battleship si este suprascrisa
    public void escapeProcedure(int escapePods) {
        super.escapeProcedure(escapePods);
        ProjectUtils.printMessage("We are in FalconHeavy now!" + this.battleshipName);
        ProjectUtils.printMessage("Escape procedure initiated in FalconHeavy class with " + escapePods + " escape pods");
    }

    public String escapeProcedure(boolean activated){
        return activated ? "Escape procedure initiated" : "Escape procedure abord";
    }

    public void escapeProcedure (int escapePods, boolean activated) {
        ProjectUtils.printMessage(escapeProcedure(activated));
        if (activated) {
            escapeProcedure(escapePods);
        }
    }


     //varargs - variable arguments - transmite un nr variabil de parametri catre metoda noastra
    public void escapeProcedure(boolean ... activated){
            for(boolean active : activated){
                ProjectUtils.printMessage("Activation sequence" + active);
            }
    }

    public void escapeProcedure(){
        ProjectUtils.printMessage("Waiting for the escape procedure");
    }







}
