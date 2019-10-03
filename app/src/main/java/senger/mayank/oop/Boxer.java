package senger.mayank.oop;

public class Boxer extends Fighter {

    private static int stamina = 29;

    public Boxer(int numberOfGloves, int punchSpeed, int punchPower) {

        super(numberOfGloves, punchSpeed, punchPower);

        if (numberOfGloves <= 0 || punchSpeed <= 0 || punchPower <= 0) {

            return;
        }

        setNumberOfGloves(numberOfGloves);
        setPunchPower(punchPower);
        setPunchSpeed(punchSpeed);


    }

    @Override
    public int getPunchSpeed() {
        return super.getPunchSpeed();
    }

    @Override
    public void setPunchPower(int punchPower) {
        super.setPunchPower(punchPower);
    }

    @Override
    public void setPunchSpeed(int punchSpeed) {
        super.setPunchSpeed(punchSpeed);
    }

    @Override
    public int getPunchPower() {
        return super.getPunchPower();
    }

    public static int getStamina() {
        return stamina;
    }

    public static void setStamina(int stamina) {
        Boxer.stamina = stamina;
    }

    public String throwJab() {

        return "Jab";
    }
}

