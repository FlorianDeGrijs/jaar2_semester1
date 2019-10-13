package design.pattern.adapter2;

public class MainAdapter2 {
    public static void main(String[] args) {
        EnemyAttacker robot = new EnemyRobotAdapter(new EnemyRobot());
        EnemyAttacker human = new Human();
        robot.fireWeapon();
        human.fireWeapon();
        robot.driveForward();
        human.driveForward();
        robot.assignDriver("YOU DIE");
        human.assignDriver("Ricardo");
    }
}
