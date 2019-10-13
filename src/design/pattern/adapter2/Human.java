package design.pattern.adapter2;

public class Human implements EnemyAttacker {
    @Override
    public void fireWeapon() {
        System.out.println("HUMAN SHOOT GUN");
    }

    @Override
    public void driveForward() {
        System.out.println("HUMAN DRIVING");
    }

    @Override
    public void assignDriver(String driver) {
        System.out.println("HUMAN DRIVER IS " + driver);
    }
}
