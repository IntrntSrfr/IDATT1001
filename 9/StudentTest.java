public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student("jeff");
        System.out.println(s1.toString());
        s1.incrementTaskAmt();
        System.out.println(s1.toString());
    }
}
