import java.time.LocalDate;

/**
 * The CovidData class is a class that contains information about entries of Covid-19 data.
 *
 * The properties that are final will act as a sort of ID, as there can be no more than one entry per country per day.
 * That means that the date and country will act together as the ID.
 *
 * The entries that are not final, are not final in case there have been false data input, and they need to be changed
 * Infected can be changed in case of false data
 * Deaths can be changed in case of false data
 */
public class CovidData {
    private final String country;
    private int infected;
    private int deaths;
    private final LocalDate date;

    /**
     *
     * @param country The name of the country - not blank
     * @param infected Amount infected - positive integer
     * @param deaths Amount dead - positive integer
     * @param date What date the data is representing
     * @throws IllegalArgumentException in case the country is blank, or there are negative numbers for infected/dead
     */
    public CovidData(String country, int infected, int deaths, LocalDate date) throws IllegalArgumentException {

        if (country.isBlank()){
            throw new IllegalArgumentException("country cannot be blank");
        }

        if (infected < 0 || deaths < 0){
            throw new IllegalArgumentException("infected or dead cannot be negative");
        }

        this.country = country;
        this.infected = infected;
        this.deaths= deaths;
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public int getInfected() {
        return infected;
    }

    /**
     * Sets a new number of infected.
     * @param infected New amount of infected
     * @throws IllegalArgumentException if infected is negative
     */
    public void setInfected(int infected) throws IllegalArgumentException{
        if (infected < 0){
            throw new IllegalArgumentException("infected cannot be negative");
        }
        this.infected = infected;
    }

    public int getDeaths() {
        return deaths;
    }

    /**
     * Sets a new number of deaths.
     * @param deaths New amount of deaths
     * @throws IllegalArgumentException if deaths is negative
     */
    public void setDeaths(int deaths) throws IllegalArgumentException{
        if (deaths < 0){
            throw new IllegalArgumentException("deaths cannot be negative");
        }
        this.deaths = deaths;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return String.format("Date: %s | Country: %s | Infected: %d | Dead: %d", this.date, this.country, this.infected, this.deaths);
    }
}