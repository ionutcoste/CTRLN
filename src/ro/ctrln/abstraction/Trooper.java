package ro.ctrln.abstraction;

import ro.ctrln.util.ProjectUtils;

public abstract class Trooper {

    private int numberOfCapabilities;

    public int getNumberOfCapabilities(){
        return this.numberOfCapabilities;
    }

    public void setNumberOfCapabilities(int nr){
        this.numberOfCapabilities=nr;
    }

    public void fight(String enemy){

        ProjectUtils.printMessage("Fighting the enemy " + enemy);
    }

    public abstract String warCry();
}
