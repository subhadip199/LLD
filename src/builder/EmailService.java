package builder;

public class EmailService {
    public void sendEmail(String message) {
        User user = new User.UserBuilder().setName("Subhadip")
                .setAge(35)
                .setEmail("subhadip@gmail.com")
                .setCity("Kolkata")
                .build();
        System.out.println("Sending email: " + user);
    }
}
