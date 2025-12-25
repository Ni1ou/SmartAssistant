package model;

public class Reminder extends Item {

    private String remindDate;

    public Reminder(int id, String title, String remindDate) {
        super(id, title);
        this.remindDate = remindDate;
    }

    @Override
    public String getType() {
        return "Reminder";
    }

    @Override
    public String toString() {
        return super.toString() + " | Remind at: " + remindDate;
    }
}

