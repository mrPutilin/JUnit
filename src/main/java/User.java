public class User {


    private String login;
    private String password;
    private String mail;
    private int age;


    public User(String login, String password, String mail, int age) {
        this.login = login;
        this.password = password;
        this.mail = mail;
        this.age = age;

    }

    public String toString() {
        return login + password + mail + age;
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }


}
