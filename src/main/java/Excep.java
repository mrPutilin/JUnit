import java.nio.file.AccessDeniedException;
import java.util.Scanner;


public class Excep {
    public static void main(String[] args) throws UserNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        getUsers();

        getUserByLoginAndPassword(login, password);

    }


    public static User[] getUsers() {
        return new User[]{
                new User("ddd", "jkl", "c@mail.ru", 74),
                new User("sss", "lll", "b@mail.ru", 22),
                new User("ppp", "asd", "a@mail.ru", 17),
        };
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        throw new UserNotFoundException();

    }

//    public static void validateUser(User user) throws AccessDeniedException {
//        if (user.getAge() < 18) {
//            throw new AccessDeniedException(messege);
//        }
//        System.out.println("Доступ разрешен");


}



