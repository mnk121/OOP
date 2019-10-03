package senger.mayank.oop;

public class Fighter {
    private int numberOfGloves;
    private int punchSpeed;
    private int punchPower;

    public int getNumberOfGloves() {
        return numberOfGloves;
    }

    public void setNumberOfGloves(int numberOfGloves) {
        this.numberOfGloves = numberOfGloves;
    }

    public int getPunchPower() {
        return punchPower;
    }

    public void setPunchPower(int punchPower) {
        this.punchPower = punchPower;
    }

    public void setPunchSpeed(int punchSpeed) {
        this.punchSpeed = punchSpeed;
    }

    public int getPunchSpeed() {
        return punchSpeed;
    }

    public Fighter(int numberOfGloves, int punchSpeed, int punchPower) {
        this.numberOfGloves = numberOfGloves;
        this.punchSpeed = punchSpeed;
        this.punchPower = punchPower;
    }
}
