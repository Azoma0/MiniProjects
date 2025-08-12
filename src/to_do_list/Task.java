package to_do_list;

import java.util.Objects;

public class Task {
    private static int nextId = 1;
    private int id;
    private String title;
    private String desription;
    private boolean isCompleted;

    public Task(String title, String desription) {
        this.id = nextId++;
        this.title = title;
        this.desription = desription;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesription() {
        return desription;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", desription='" + desription + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && isCompleted == task.isCompleted && Objects.equals(title, task.title) && Objects.equals(desription, this.desription);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id, title, desription, isCompleted);
    }


}

