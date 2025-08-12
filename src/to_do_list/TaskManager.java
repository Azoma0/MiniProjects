package to_do_list;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager(){
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        this.tasks.add(task);
        System.out.println("This added: " + task.getTitle());
    }

    public void showTasks(){
        if(tasks.isEmpty()){
            System.out.println("данные пустое");
        }else{
            for (Task task : tasks){
                System.out.println(task);
            }
        }
    }

    public void  deleteTasks(int id){
        boolean removed = this.tasks.removeIf(task -> task.getId() == id);
        if(removed){
            System.out.println("Задача удалена по этой id: " + id);
        }else {
            System.out.println("нету задача по этой id");
        }
    }

    public void markTaskAsCompleted(int id){
       for (Task task: tasks){
           if(task.getId() == id){
               task.setCompleted(true);
               System.out.println("Задача '" + task.getTitle() + "' отмечена как выполненная");
               return;
           }
       }
        System.out.println("Такого id нету");
    }

    public void saveToFile(String fileName){
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))){
            for (Task task: tasks){
                writer.println(task.getId() + ";" + task.getTitle() + ";" + task.getDesription() + ";" + task.isCompleted());
            }
            System.out.println("Задачи сохранены в файл " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении файла" + e.getMessage());
        }
    }

}
