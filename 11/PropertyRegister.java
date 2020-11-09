import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A property register to manage several properties and get information about them.
 * <p>
 * An ArrayList of type {@link Property} is used in favor of an array because it is much easier to work with ArrayList
 * when it comes to registering new info, as well ArrayLists have generic functions we can use to get the same info
 * as we would with a regular array on much fewer lines.
 * <p>
 * An example would be that we are using streams with lambda functions instead of forEach, which is many fewer lines,
 * and is much more readable.
 */
public class PropertyRegister {

    // The ArrayList where the properties are stored
    private final ArrayList<Property> properties;


    /**
     * Creates a new PropertyRegister
     */
    public PropertyRegister() {
        this.properties = new ArrayList<>();
    }

    /**
     * Registers a new property to the collection
     *
     * @param p The {@link Property} to be registered
     *
     * @throws IllegalArgumentException if a property with the same identifying properties already exists in the registry
     */
    public void registerProperty(Property p) throws IllegalArgumentException{
        if(getPropertyByInfo(p.getMunicipalityNumber(), p.getLotNumber(), p.getSectionNumber()) != null){
            throw new IllegalArgumentException("Property already exists");
        }
        properties.add(p);
    }

    /**
     * Removes any property that has the same values as those given.
     * This function may remove a property, or remove nothing if there is no properties with given values that exists.
     *
     * @param munNr KommuneNr
     * @param lotNr GårdsNr
     * @param secNr BruksNr
     * @return returns true if any properties were removed, false otherwise
     */
    public boolean removeProperty(int munNr, int lotNr, int secNr) {
        return properties.remove(getPropertyByInfo(munNr, lotNr, secNr));
    }

    /**
     * Returns the amount of properties that are in the register
     * @return returns the property amount
     */
    public int getTotalProperties(){
        return properties.size();
    }



    /**
     * Prints every {@link Property}
     */
    public void showAllProperties() {
        // this can also be used, I just havent because of the sequence diagram
        // properties.forEach(System.out::println);
        for(Property p : properties){
            System.out.println(p.toString());
        }
    }

    /**
     * Searches for a property which has the same values of properties as those given
     * Streams are used to filter out the properties that do not contain the values we are looking for, and
     * returns a {@link Property} if one with the values we are looking for exists, otherwise it returns null.
     *
     * @param munNr MunicipalityNumber
     * @param lotNr LotNumber
     * @param secNr SectionNumber
     * @return returns a {@link Property} if one is found, returns null otherwise
     */
    public Property getPropertyByInfo(int munNr, int lotNr, int secNr) {
        return properties.stream()
                .filter(t -> t.getMunicipalityNumber() == munNr &&
                        t.getLotNumber() == lotNr &&
                        t.getSectionNumber() == secNr)
                .findFirst()
                .orElse(null);
    }

    /**
     * Searches for all properties with a given lot number
     *
     * @param lotNr LotNumber
     * @return returns a {@link List<Property>}
     */
    public List<Property> getPropertiesByLotNr(int lotNr) {
        return properties.stream().filter(t -> t.getLotNumber() == lotNr).collect(Collectors.toList());
    }

    /**
     * Calculates the total average area of all the properties in the propertyList
     *
     * @return a double with the total average area across the properties
     */
    public double getTotalAverageArea() {
        return properties.stream().mapToDouble(Property::getArea).sum() / properties.size();
    }

    @Override
    public String toString() {
        return "PropertyRegister{" +
                "properties=" + properties +
                '}';
    }
}
