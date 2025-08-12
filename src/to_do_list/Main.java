package to_do_list;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        boolean isTrue = true;
        int choice;
        while (isTrue){
            System.out.println("===== TO-DO LIST =====");
            System.out.println("1. Добавить задачу\n" +
                    "2. Показать все задачи\n" +
                    "3. Отметить как выполненную\n" +
                    "4. Удалить задачу\n" +
                    "5. Сохранить в файл\n" +
                    "6. Загрузить из файла\n" +
                    "0. Выход\n");

            System.out.print("Выбирете значение: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    Scanner input = new Scanner(System.in);
                    System.out.print("Введите название задачи: ");
                    String inputTitle = input.nextLine();

                    System.out.print("Введите описание: ");
                    String inputDescription = input.nextLine();

                    Task task = new Task(inputTitle, inputDescription);
                    taskManager.addTask(task);

                    break;
                case 2:
                    taskManager.showTasks();
                    break;
                case 3:
                    Scanner scannerStatus = new Scanner(System.in);
                    System.out.print("Выбирите задачу по id: ");
                    int inputStatus = scannerStatus.nextInt();
                    taskManager.markTaskAsCompleted(inputStatus);
                    break;
                case 4:
                    Scanner scannerId = new Scanner(System.in);
                    System.out.print("Выбирите задачу по id: ");
                    int inputId = scannerId.nextInt();
                    taskManager.deleteTasks(inputId);
                    break;
                case 5:
                    taskManager.saveToFile("tasks.csv");
                    break;
                case 6:
                    break;
                case 0:
                    isTrue = false;
                    break;
            }
        }
    }


}
