package solid.dip;

public class MySqlDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving user in MySQL: " + data);
    }
}
