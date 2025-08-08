package task_manager;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public enum Priority{
        LOW,
        MEDIUM,
        HIGH
    }
    private static int nextId = 1;
    private int id;
    private String title;
    private Priority priority;

    public Task(String title, Priority priority){
        this.id = nextId++;
        this.title = title;
        this.priority = priority;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }

    public Priority getPriority(){
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", priority=" + priority +
                '}';
    }
}

class TaskManager{
    private List<Task> tasks;

    public TaskManager(){
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        this.tasks.add(task);
        System.out.println("Task added: " + task.getTitle());
    }

    public void removeTaskById(int id){
       boolean removed = tasks.removeIf(obj -> obj.getId() == id);
       if(removed){
           System.out.println("Task with ID " + id + " has been successfully removed");
       }else{
           System.out.println("Task with ID " + id + " not found");
       }
    }

    public void showTasks(){
       if(tasks.isEmpty()){
           System.out.println("No tasks to display");
       }else{
           for (Task task: tasks){
               System.out.println(task);
           }
       }
    }
}