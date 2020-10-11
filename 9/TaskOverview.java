import java.util.Arrays;

public class TaskOverview {
    private Student[] students;
    private int registrations;

    public TaskOverview(int size) {
        students = new Student[size];
        registrations = 0;
    }

    private void growStudents() {
        students = Arrays.copyOf(students, students.length + 3);
    }
    public Student[] getStudents() {
        return students;
    }

    public int getRegistrations() {
        return registrations;
    }


    public Student getStudentByName(String name) {
        for (Student s : students) {
            if (s == null) {
                break;
            }
            if (s.getName().toLowerCase().equals(name.toLowerCase())) {
                return s;
            }
        }
        return null;
    }

    public int studentTasksDone(String name) {
        return getStudentByName(name).getFinishedTasks();
    }

    public boolean registerStudent(Student s) {
        if (registrations + 1 > students.length) {
            growStudents();
        }
        if (getStudentByName(s.getName()) != null) {
            return false;
        }

        students[registrations] = s;
        registrations++;
        return true;
    }

    public void markTask(String name) {
        Student s = getStudentByName(name);
        if (s == null) {
            return;
        }

        s.incrementTaskAmt();
    }

    public String toString() {
        return String.format("%d students", registrations);
    }
}
