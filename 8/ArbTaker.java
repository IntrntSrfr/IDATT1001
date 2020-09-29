import java.util.Calendar;
import java.util.GregorianCalendar;

public class ArbTaker {
    private final Person personalia;
    private final int workerID;
    private final int employmentYear;
    private double salary;
    private double taxPercent;

    private static GregorianCalendar cal = new GregorianCalendar();

    public ArbTaker(Person personalia, int workerID, int employmentYear, double salary, double taxPercent){
        this.personalia = personalia;
        this.workerID = workerID;
        this.employmentYear = employmentYear;
        this.salary = salary;
        this.taxPercent = taxPercent;
    }

    public Person getPersonalia() {
        return personalia;
    }

    public int getWorkerID() {
        return workerID;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    public double taxPaid(){
        return salary*taxPercent;
    }
    public double getSalaryBeforeTax(){
        return salary;
    }
    public double getSalaryAfterTax(){
        return salary-taxPaid();
    }
    public double taxesPaidYear(){
        return (taxPaid()*10)+(taxPaid()/2);
    }

    public String getName(){
        return String.format("%s, %s", personalia.getLastName(), personalia.getFirstName());
    }

    public int getAge(){
        return cal.get(Calendar.YEAR)-personalia.getBirthYear();
    }

    public int getYearsEmployed(){
        return cal.get(Calendar.YEAR)-employmentYear;
    }

    public boolean beenEmployedLongerThan(int years){
        return getYearsEmployed() > years;
    }


}
