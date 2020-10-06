public class Client {
    public static void main(String[] args) {
        TaskOverview t = new TaskOverview(5);

        System.out.println(t);

        Student s1 = new Student("jeff");
        Student s2 = new Student("geoff");
        Student s3 = new Student("lol");
        t.registerStudent(s1);
        t.registerStudent(s2);
        t.registerStudent(s3);

        t.markTask("jeff");

        boolean ok1 = t.registerStudent(new Student("jeff"));
        boolean ok2 = t.getStudentByName("asd") == null;
        boolean ok3 = t.getStudentByName("jeff").taskAmount == 1;

        if (!ok1 && ok2 && ok3) {
            System.out.println("test 1 ok");
        }

        System.out.println(t);

        for (int i = 0; i < 6; i++) {
            if (!t.registerStudent(new Student("jeff" + i))) {
                break;
            }
        }

        if (t.getRegistrations() == 9 && t.getStudents().length == 11) {
            System.out.println("test 2 ok");
        }

        System.out.println(t.getStudentByName("jeff"));
        System.out.println(t.getStudentByName("asd"));

        System.out.println(t);
        System.out.println(t.getStudents().length);
    }
}
