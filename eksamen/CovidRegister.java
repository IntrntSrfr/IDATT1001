import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * A register to manage entries about Covid-19 data and get information about them.
 *
 * An ArrayList of type CovidData is used in favor of other collection frameworks because it is much easier to work
 * with ArrayLists when it comes to registering new info, as well ArrayLists have generic functions we can use to get
 * the same information we would get from any other framework, but in a much nicer looking way.
 *
 * An example would be that we are using streams with lambda functions instead of forEach, which is fewer lines,
 * and is much more readable.
 */
public class CovidRegister {
    private final ArrayList<CovidData> entries;

    /**
     * Creates a new CovidRegister
     */
    public CovidRegister(){
        this.entries = new ArrayList<>();
    }

    /**
     * Registers a new entry.
     * @param e The CovidData
     * @throws IllegalArgumentException if another entry with the same date and country exists
     */
    public void registerEntry(CovidData e) throws IllegalArgumentException{
        if(getEntryByInfo(e.getCountry(), e.getDate())!=null){
            throw new IllegalArgumentException("entry already exists");
        }
        entries.add(e);
    }

    /**
     * Displays every entry in the register
     */
    public void showAllEntries(){
        // using method references makes it look nicer
        // adding another println so it adds a line of space afterwards, makes it nicer to look at
        entries.forEach(System.out::println);
        System.out.println();
    }

    /**
     * Gets the first occurrence of an entry that corresponds to the given values
     * @param country the country
     * @param date the date
     * @return a CovidData object if one is found, null otherwise
     */
    public CovidData getEntryByInfo(String country, LocalDate date){
        return entries.stream()
                .filter(e -> e.getCountry().toUpperCase().equals(country.toUpperCase()) && e.getDate().equals(date))
                .findFirst()
                .orElse(null);
    }

    /**
     * Gets the first occurrence of an entry on a given date.
     * @param date the date
     * @return a CovidData object if one exists, null otherwise
     */
    public CovidData getFirstEntryByDate(LocalDate date){
        return entries.stream()
                .filter(e -> e.getDate().equals(date))
                .findFirst()
                .orElse(null);
    }

    /**
     * Gets all occurrences of entries on a given date
     * @param date the date
     * @return a List of CovidData
     */
    public List<CovidData> getEntriesByDate(LocalDate date){
        return entries.stream()
                .filter(e->e.getDate().equals(date))
                .collect(Collectors.toList());
    }

    /**
     * Gets all entries of CovidData that occurs after a given date
     * @param date the date
     * @return a list of CovidData
     */
    public List<CovidData> getEntriesAfterDate(LocalDate date){
        return entries.stream()
                .filter(e->e.getDate().isAfter(date))
                .collect(Collectors.toList());
    }

    /**
     * Gets the amount dead for a given country
     * @param country the country
     * @return an integer amount of dead people
     */
    public int getDeadByCountry(String country){
        return entries.stream()
                .filter(e->e.getCountry().toUpperCase().equals(country.toUpperCase()))
                .mapToInt(CovidData::getDeaths).sum();
    }

    /**
     * Gets the amount of infected for a given country
     * @param country the country
     * @return an integer amount of infected people
     */
    public int getInfectedByCountry(String country){
        return entries.stream()
                .filter(e->e.getCountry().toUpperCase().equals(country.toUpperCase()))
                .mapToInt(CovidData::getInfected).sum();
    }

    /**
     * Gets an iterator of the CovidData registry ArrayList
     * @return Iterator of type CovidData
     */
    public Iterator<CovidData> getEntryIterator(){
        return entries.iterator();
    }

    /**
     * Gets the amount of entries in the register
     * @return integer amount of entries
     */
    public int getRegistrations(){
        return entries.size();
    }

    @Override
    public String toString() {
        return String.format("Register: %d entries", entries.size());
    }
}
