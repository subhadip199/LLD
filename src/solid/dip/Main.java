package solid.dip;

public class Main {
    public static void main(String[] args) {
        UserService mysqlUserService = new UserService(new MySqlDatabase());
        mysqlUserService.saveUser("Alice");

        UserService mongoUserService = new UserService(new MongoDatabase());
        mongoUserService.saveUser("Bob");
    }
}
