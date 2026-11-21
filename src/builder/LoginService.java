package builder;

public class LoginService {
    public void registerUser() {
        User user = new User.UserBuilder()
                .setName("Aman")
                .setEmail("aman@gmail.com")
                .setCity("Mumbai")
                .build();
        System.out.println("Registering user: " + user);
    }
}
