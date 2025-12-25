package model;

public class Task extends Item {

    private String deadline;

    public Task(int id, String title, String deadline) {
        super(id, title);
        this.deadline = deadline;
    }

    @Override
    public String getType() {
        return "Task";
    }

    @Override
    public String toString() {
        return super.toString() + " | Deadline: " + deadline;
    }
}
