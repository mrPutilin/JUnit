import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        int i = 0;

        while (true) {

            menu();


            int pick = scanner.nextInt();


            switch (pick) {
                case 1:
                    toDoTask(list, i);
                    i++;
                    break;

                case 2:
                    toDoList(list);
                    break;

                case 3:
                    deleteTask(list);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Нет такой операции");
            }
            System.out.println();


        }


    }

    public static void toDoTask(List<String> list, int i) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите задачу для планирования:");

        String task = scanner.nextLine();
        list.add(i, task);


    }

    public static void toDoList(List<String> list) {
        System.out.println("Список задач:");
        Iterator<String> iterator = list.iterator();
        int j = 1;
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(j + ". " + s);
            j++;
        }

    }


    public static void deleteTask(List<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете какую задачу удалить:");
        int remove = scanner.nextInt() - 1;
        list.remove(remove);
    }

    public static void menu() {
        System.out.println("Выберете действие: \n" +
                "1. Добавить задачу. \n" +
                "2. Вывести список задач. \n" +
                "3. Удалить задачу. \n" +
                "4. Выход."
        );
    }


}
