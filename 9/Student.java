public class Student {
    final String name;
    int taskAmount;

    public static void main(String[] args){

        Student s = new Student("jeff");

        System.out.println(s);
        s.incrementTaskAmt();
        System.out.println(s);

    }

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

    @Override
    public String toString() {
        return String.format("%s - %d tasks finished.", name, taskAmount);
    }
}
