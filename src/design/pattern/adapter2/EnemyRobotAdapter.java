package design.pattern.adapter2;

public class EnemyRobotAdapter implements EnemyAttacker {

    private EnemyRobot robot;

    public EnemyRobotAdapter(EnemyRobot robot) {
        this.robot = robot;
    }

    @Override
    public void fireWeapon() {
        robot.smashWithHand();
    }

    @Override
    public void driveForward() {
        robot.walkForward();
    }

    @Override
    public void assignDriver(String driver) {
        robot.reactToHuman(driver);
    }
}
