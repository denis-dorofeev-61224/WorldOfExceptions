public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world of exceptions!");
        System.out.println("**************************");
        String login = "java_skypro_g";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";

        try {
            UserValidator.validate(login, password, confirmPassword);
            System.out.println("Login and password are valid!");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Validation error: " + e.getMessage());
        }
    }
}