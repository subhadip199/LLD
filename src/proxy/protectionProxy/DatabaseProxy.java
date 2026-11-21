package proxy.protectionProxy;

public class DatabaseProxy implements Database {
    private Database database;
    private String role;

    public DatabaseProxy(String role) {
        this.role = role;
        this.database = new MySqlDatabase();
    }

    @Override
    public void delete() {
        // Add any additional logic here, e.g., permission checks
        if (role.equals("admin")) {
            database.delete();
        } else {
            System.out.println("Access Denied: Only admin can delete users.");
        }

    }
}
