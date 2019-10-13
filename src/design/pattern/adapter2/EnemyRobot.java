package design.pattern.adapter2;

public class EnemyRobot {

    public EnemyRobot() {
    }

    public void smashWithHand() {
        System.out.println("ROBOT SMASH");
    }

    public void walkForward() {
        System.out.println("ROBOT WALK");
    }

    public void reactToHuman(String reaction) {
        System.out.println("ROBOT SAYS " + reaction);
    }
}
