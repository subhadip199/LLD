package solid.isp;

public class DevOpsEngineer implements Tester, Deployer {
    @Override
    public void testCode() {
        System.out.println("DevOps engineer is testing deployment");
    }

    @Override
    public void deployApplication() {
        System.out.println("DevOps engineer is deploying application");
    }
}
