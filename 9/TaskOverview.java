import java.util.ArrayList;

public class TaskOverview {
    ArrayList<Student> students;

    public TaskOverview() {
        students = new ArrayList<Student>();
    }

    public int getStudentAmt() {
        return students.size();
    }

    public Student getStudentByName(String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public int studentTasksDone(String name) {
        return getStudentByName(name).getFinishedTasks();
    }

    public void registerStudent(Student s) {
        students.add(s);
    }

    public void markTask(String name) {
        Student s = getStudentByName(name);
        if (s == null) {
            return;
        }

        s.incrementTaskAmt();
    }

    public String toString() {
        return String.format("%d students", students.size());
    }
}
