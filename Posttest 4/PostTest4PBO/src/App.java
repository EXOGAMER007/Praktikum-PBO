import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        String username;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Username :");
        username = input.nextLine();

        User user = new User(username);
        user.menu();
        input.close();
    }
}
