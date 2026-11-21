package builder;

public class UserMigrationService {
    public void migrateUser() {
        User user = new User.UserBuilder().setName("Rohit")
                .setAge(30)
                .setEmail("rohit@gmail.com")
                .build();
        System.out.println("Migrating user: " + user);
    }
}
