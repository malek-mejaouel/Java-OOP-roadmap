package todo;

public class Task {
    private String desc;
    private boolean done;

    public Task(String d) {
        this.desc = d;
        this.done = false;
    }

    public void markAsDone() {
        this.done = true;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isDone() {
        return done;
    }

    @Override
    public String toString() {
        return (done ? "[✔]" : "[ ]") + " " + desc;
    }
}
