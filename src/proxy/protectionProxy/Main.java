package proxy.protectionProxy;

public class Main {
    public static void main(String[] args) {
        DatabaseProxy manager = new DatabaseProxy("admin");

        // Attempt to delete a user with admin role
        manager.delete();

        DatabaseProxy user = new DatabaseProxy("user");
        // Attempt to delete a user with non-admin role
        user.delete();
    }
}
