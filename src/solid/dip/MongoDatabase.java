package solid.dip;

public class MongoDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving user in MongoDB: " + data);
    }
}
