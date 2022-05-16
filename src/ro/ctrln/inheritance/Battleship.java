package ro.ctrln.inheritance;

import ro.ctrln.util.ProjectUtils;

import java.util.Objects;
//POJO Plain Old Java Object
public class Battleship {

    public static final int ID = 1;

    protected String battleshipName;
    private int battleshipCapacity;

    public String getBattleshipName(){
        return this.battleshipName;
    }

    public void setBattleshipName(String name){
        if (name.contains("bad"))
            return;
        this.battleshipName=name;
    }

    public int getBattleshipCapacity() {
        return battleshipCapacity;
    }

    public void setBattleshipCapacity(int battleshipCapacity) {
        this.battleshipCapacity = battleshipCapacity;
    }

    @Override
    public String toString() {
        return "Battleship{" +
                "battleshipName='" + battleshipName + '\'' +
                ", battleshipCapacity=" + battleshipCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battleship that = (Battleship) o;
        return battleshipCapacity == that.battleshipCapacity && battleshipName.equals(that.battleshipName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battleshipName, battleshipCapacity);
    }

    public void escapeProcedure(int escapePods){
        ProjectUtils.printMessage("Escape procedure initiated in Battleship class with " + escapePods + " escape pods");
    }
}
