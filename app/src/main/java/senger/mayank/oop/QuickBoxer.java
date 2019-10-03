package senger.mayank.oop;

public class QuickBoxer extends Boxer {


    private int kickSpeed = 50;
    private int kickPower = 70;


    public int getKickPower() { return kickPower; }

    public void setKickPower(int kickPower) { this.kickPower = kickPower; }

    @Override
    public int getPunchSpeed() {
        return super.getPunchSpeed();
    }

    @Override
    public void setPunchSpeed(int punchSpeed) {
        super.setPunchSpeed(punchSpeed);
    }

    @Override
    public int getPunchPower() {
        return super.getPunchPower();
    }

    @Override
    public void setPunchPower(int punchPower) {
        super.setPunchPower(punchPower);
    }

    public  QuickBoxer(int numberOfGloves, int kickSpeed, int kickPower, int punchSpeed, int punchPower){

        super(numberOfGloves,punchPower, punchSpeed);

        this.kickPower = kickPower;
        this.kickSpeed = kickSpeed;
        setPunchPower(punchPower);
        setPunchSpeed(punchSpeed);

    }
}

