public class Client {
    public static void main(String[] args) {
        Person p1 = new Person("jeff", "lol", 2002);
        ArbTaker at1 = new ArbTaker(p1, 1, 2015, 100000, 0.3);

        System.out.println(at1.getName());
        System.out.println(at1.getAge());
        System.out.println(at1.getSalaryBeforeTax());
        System.out.println(at1.taxPaid());
        System.out.println(at1.getSalaryAfterTax());
        System.out.println(at1.taxesPaidYear());
        System.out.println(at1.beenEmployedLongerThan(10));
    }
}
