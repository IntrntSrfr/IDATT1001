public class Student {
    String name;
    int taskAmount;

    public Student(String name) {
        this.name = name;
        taskAmount = 0;
    }

    public String getName() {
        return name;
    }

    public int getFinishedTasks() {
        return taskAmount;
    }

    public void incrementTaskAmt() {
        this.taskAmount++;
    }

    public String toString() {
        return String.format("%s - %d tasks finished.", name, taskAmount);
    }
}
