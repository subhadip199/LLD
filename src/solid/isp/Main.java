package solid.isp;

public class Main {
    public static void main(String[] args) {
        BackendDeveloper backendDeveloper = new BackendDeveloper();
        backendDeveloper.writeCode();
        backendDeveloper.testCode();

        QaEngineer qaEngineer = new QaEngineer();
        qaEngineer.testCode();

        DevOpsEngineer devOpsEngineer = new DevOpsEngineer();
        devOpsEngineer.testCode();
        devOpsEngineer.deployApplication();
    }
}
