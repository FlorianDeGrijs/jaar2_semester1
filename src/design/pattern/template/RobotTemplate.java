package design.pattern.template;

public abstract class RobotTemplate {

    public RobotTemplate() {
    }

    public void go() {
        start();
        getParts();
        assemble();
        if (testOK()) {
            test();
        }
        stop();
    }

    protected boolean testOK() {
        return true;
    }

    public void start() {
        System.out.println("Starting....");
    }

    public void getParts() {
        System.out.println("Getting parts....");
    }

    public void assemble() {
        System.out.println("Assembling....");
    }

    public void test() {
        System.out.println("Testing....");
    }

    public void stop() {
        System.out.println("Stopping....");
    }
}
