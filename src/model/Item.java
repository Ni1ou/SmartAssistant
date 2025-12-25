package model;

public abstract class Item {

    protected int id;
    protected String title;
    protected boolean completed;

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public abstract String getType();

    @Override
    public String toString() {
        String status = completed ? "Done" : "Open";
        return "ID: " + id + " | " + title + " | Status: " + status;
    }
}

