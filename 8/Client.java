public class Client {
    public static void main(String[] args) {
        Person p1 = new Person("jeff", "lol", 2002);
        ArbTaker at1 = new ArbTaker(p1, 1, 2015, 100000, 0.3);

        System.out.println(at1.getName());
        System.out.println(at1.getAge());
        System.out.println(at1.getSalaryBeforeTax());
        System.out.println(at1.getTaxPaid());
        System.out.println(at1.getSalaryAfterTax());
        System.out.println(at1.getTaxesPaidYear());
        System.out.println(at1.beenEmployedLongerThan(10));
        System.out.println(at1.beenEmployedLongerThan(5));
        System.out.println(at1.beenEmployedLongerThan(4));

        try{
            at1.setSalary(-3000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try{
            at1.setTaxPercent(40);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
