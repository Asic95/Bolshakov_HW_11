package Bolshakov_HW_11;

public class ExceptionRules {

    String login = "";
    String password = "";

    void setLogin(String login) {
        this.login = login;
    }

    void setPassword(String password) {
        this.password = password;
    }

    public void TryToLogIn() throws AuthorizationException {
        if ((password == null) || (login == null)) {
            throw new AuthorizationException("Your login or password is empty!");
        } else if (password.length() < 6) {
                throw new AuthorizationException("Your password is too short!");
            } else if (!login.equals(LOGINDATA) || !password.equals(PASSWORDDATA)) {
                throw new AuthorizationException("We can`t find your login or password in database!");
            } else {
                System.out.println("You've successfully logged into the system!");
            }
        }
    final static String LOGINDATA = "qwerty12345";
    final static String PASSWORDDATA = "qwerty12345";
}
