package solid.isp;

public class BackendDeveloper implements Coder, Tester {
    @Override
    public void writeCode() {
        System.out.println("Backend developer is writing code");
    }

    @Override
    public void testCode() {
        System.out.println("Backend developer is testing code");
    }
}
