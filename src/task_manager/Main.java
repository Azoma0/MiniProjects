package task_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        boolean start = true;
        System.out.println("\tWelcome to Task Manager");
        while (start) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----" + "----".repeat(7));
            System.out.println("1 - add task\n2 - remove task\n3 - show tasks\n4 - exit\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    try {
                        Scanner scan = new Scanner(System.in);
                        System.out.print("Enter title: ");
                        String inputTitle = scan.nextLine();

                        System.out.print("Enter priority: ");
                        String inputPriority = scan.nextLine();
                        Task.Priority priority = Task.Priority.valueOf(inputPriority.toUpperCase());
                        Task task = new Task(inputTitle, priority);
                        taskManager.addTask(task);

                    } catch (IllegalArgumentException e) {
                        System.out.println("Error! Invalid priority value entered. Please enter one of the following: LOW, MEDIUM, HIGH.");
                    }
                    break;
                case 2:
                    int searchId = scanner.nextInt();
                    taskManager.removeTaskById(searchId);
                    break;
                case 3:
                    taskManager.showTasks();
                    break;
                case 4:
                    start = false;
                    break;
            }
        }
    }
}
