public class TaskOverview {
    private Student[] students;
    private int registrations;

    public TaskOverview() {
        students = new Student[30];
        registrations = 0;
    }

    public Student[] getStudents(){
        return students;
    }

    public int getRegistrations() {
        return registrations;
    }

    public Student getStudentByName(String name) {
        for (Student s : students) {
            if(s == null){
                continue;
            }
            if (s.getName().equals(name)) {
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
