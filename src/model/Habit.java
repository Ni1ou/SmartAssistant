package model;

public class Habit extends Item {

    private int streak;

    public Habit(int id, String title) {
        super(id, title);
        this.streak = 0;
    }

    @Override
    public void markCompleted() {
        super.markCompleted();
        streak++;
    }

    @Override
    public String getType() {
        return "Habit";
    }

    @Override
    public String toString() {
        return super.toString() + " | Streak: " + streak;
    }
}

