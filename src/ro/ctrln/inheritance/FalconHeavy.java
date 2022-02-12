package ro.ctrln.inheritance;

public class FalconHeavy extends Battleship implements Starship,Rocket{

    private String destination;

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "FaconHeavy{" +
                "destination='" + destination + '\'' +
                ", battleship name: " + getBattleshipName() +
                ", battleship capacity: " + getBattleshipCapacity() +
                '}';
    }

    @Override
    public void warp() {
        System.out.println("FalconHeavy doesn't warp. It goes to the moon!");
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
            System.out.println(i + "...");
        }
    }
}
