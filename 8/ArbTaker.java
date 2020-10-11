import java.util.Calendar;
import java.util.GregorianCalendar;

public class ArbTaker {
    private final Person personalia;
    private final int workerID;
    private final int employmentYear;
    private double salary;
    private double taxPercent;

    private static final GregorianCalendar cal = new GregorianCalendar();

    public ArbTaker(Person personalia, int workerID, int employmentYear, double salary, double taxPercent) {
        this.personalia = personalia;
        this.workerID = workerID;
        this.employmentYear = employmentYear;
        this.salary = salary;
        this.taxPercent = taxPercent;
    }

    public Person getPersonalia() {
        return personalia;
    }
/*

    public void setFirstName(String firstName) {
        this.personalia.setFirstName(firstName);
    }

    public void setLastName(String lastName) {
        this.personalia.setFirstName(lastName);
    }
*/

    public int getWorkerID() {
        return workerID;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public double getSalary() {
        return salary;
    }
    public double getSalaryPerYear() {
        return salary*12;
    }

    public void setSalary(double salary) throws IllegalArgumentException {
        if (salary < 0 ){
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.salary = salary;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) throws IllegalArgumentException {
        if(0>taxPercent || taxPercent > 1){
            throw new IllegalArgumentException("Salary cannot be above 1 or below 0");
        }
        this.taxPercent = taxPercent;
    }

    public double getTaxPaid() {
        return salary * taxPercent;
    }

    public double getSalaryBeforeTax() {
        return salary;
    }

    public double getSalaryAfterTax() {
        return salary - getTaxPaid();
    }

    public double getTaxesPaidYear() {
        return getTaxPaid() * (10 + 0.5);
    }

    public String getName() {
        return String.format("%s, %s", personalia.getLastName(), personalia.getFirstName());
    }

    public int getAge() {
        return cal.get(Calendar.YEAR) - personalia.getBirthYear();
    }

    public int getYearsEmployed() {
        return cal.get(Calendar.YEAR) - employmentYear;
    }

    public boolean beenEmployedLongerThan(int years) {
        return getYearsEmployed() > years;
    }

    public String toString() {
        return String.format("Name: %s\n" +
                "Age: %d\nSalary: %f\n" +
                "Tax percent: %f\nSalary after tax: %f\n" +
                "Taxes paid per month: %f\nTaxes paid per year: %f",
                getName(), getAge(), getSalary(),
                getTaxPercent(), getSalaryAfterTax(), getTaxPaid(), getTaxesPaidYear());
    }
}
