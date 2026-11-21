package builder;

public class Main {
    public static void main() {
        LoginService loginService = new LoginService();
        loginService.registerUser();

        EmailService emailService = new EmailService();
        emailService.sendEmail("Welcome to our platform!");

        UserMigrationService userMigrationService = new UserMigrationService();
        userMigrationService.migrateUser();
    }
}
