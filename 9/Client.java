public class Client {
    public static void main(String[] args) {
        TaskOverview t = new TaskOverview();

        System.out.println(t);

        Student s1 = new Student("jeff");
        Student s2 = new Student("geoff");
        Student s3 = new Student("lol");
        t.registerStudent(s1);
        t.registerStudent(s2);
        t.registerStudent(s3);

        t.markTask("jeff");

        System.out.println(t.getStudentByName("jeff"));
        System.out.println(t.getStudentByName("asd"));

        System.out.println(t);
    }
}
