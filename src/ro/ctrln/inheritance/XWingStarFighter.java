package ro.ctrln.inheritance;

import ro.ctrln.util.ProjectUtils;

public class XWingStarFighter implements Starship {

    private String destination;

    private int lightYearsToDestination;

    @Override
    public void warp() {
        ProjectUtils.printMessage("XWING STAR fighter este in viteza warp");
    }

    @Override
    public void setStarshipDestination(String destination) {
        switch(destination) {
            case "base":
                this.destination="Tatooine";
                break;
            case "empire":
                this.destination="Coruscant";
                break;
            default:
                this.destination="unknown";
        }
    }

    @Override
    public double computeWarpSpeed(int warpFactor, int lightYearsToDestination) {
        this.lightYearsToDestination = lightYearsToDestination;
        return Math.pow(warpFactor,3) * Math.pow(10,8);
    }

    @Override
    public String toString() {
        return "XWingStarFighter{" +
                "destination='" + destination + '\'' +
                ", lightYearsToDestination=" + lightYearsToDestination +
                '}';
    }
}
