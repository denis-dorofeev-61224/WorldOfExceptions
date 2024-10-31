public class UserValidator {
    public static void validate(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Invalid login: must be <= 20 characters and contain only letters, digits, or underscores.");
        }

        if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Invalid password: must be <= 20 characters, contain only letters, digits, or underscores, and match confirm password.");
        }
    }
}
