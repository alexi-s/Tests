import model.User;

public class Main {

    public static void main(String[] args) {
        User u1 = User.builder()
                .email("admin@gmail.com")
                .username("admin")
                .password("admin")
                .build();

        System.out.println(u1);

    }
}
