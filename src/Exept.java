import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exept {

    private HashMap<String, Double> students = new HashMap<>();

    public void addStudent(String name, double averageGrade) {
        students.put(name, averageGrade);
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public void getStudent(String lastName) {
        if (students.containsKey(lastName)) {
            System.out.println(String.format("%s -> %.2f", lastName, students.get(lastName)));
        } else System.out.println("Такого студента нет!");

    }

    public void getAllStudents() {
        int i = 0;
        for (Map.Entry<String, Double> pair : students.entrySet()) {
            i++;
            System.out.println(String.format("%d. %s -> %.2f", i, pair.getKey(), pair.getValue()));
        }
    }

    public int size() {
        return students.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exept A9 = new Exept();
        int choice;
        do {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1. Добавить студента\n 2. Удалить студента\n 3. Посмотреть список всех студентов и их оценки\n 4. Найти студента\n");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Введите фамилию студента: ");
                    String lastName = scanner.next();
                    System.out.print("Введите средний бал студента:");
                    int mark = scanner.nextInt();
                    if (mark > 12 && mark < 1)
                        System.out.println("Не удалось добавить студента: введён неккоректный средний бал");
                    else A9.addStudent(lastName, mark);
                    System.out.println("Студент добавлен!");
                    break;
                }
                case 2: {
                    System.out.println("Введите фамилию студента");
                    String lastName = scanner.nextLine();
                    try {
                        A9.removeStudent(lastName);
                    } catch (Exception e) {
                        System.out.println("Такого студента нет!\n");
                    }
                    break;
                }
                case 3: {
                    if (A9.size() == 0) {
                        System.out.println("В списке нет студентов!\n");
                        break;
                    }
                    A9.getAllStudents();
                    break;
                }
                case 4: {
                    System.out.print("Введите фамилию студента: ");
                    String lastName = scanner.next();
                    A9.getStudent(lastName);
                    break;
                }
            }
        } while (choice != 10);
    }
}
