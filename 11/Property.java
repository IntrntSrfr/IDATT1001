/**
 * A property object that contains information about a property, which can be edited at any time.
 * <p>
 * There are several properties that are not final.
 * Those properties are the name of the property, the area of the property and the name of the owner.
 * <p>
 * The name of the property can be changed in the case that someone wants to change their property name.
 * The area of the property can be changed in case someone buys additional area to add to their lot, or if they sell
 * some of the area.
 * The owner name can be changed in case there is a new owner, or if the current owner changes their name.
 * The rest of the fields are to remain final as they are unique to each lot and is used to identify it.
 *
 */
public class Property {

    private final int municipalityNumber;
    private final String municipalityName;
    private final int lotNumber;
    private final int sectionNumber;
    private String name;
    private double area;
    private String ownerName;

    /**
     *
     * @param municipalityNumber Kommunenummer
     * @param municipalityName Kommunenavn
     * @param lotNumber Gårdsnummer
     * @param sectionNumber Bruksnummer
     * @param name Bruksnavn - can be empty
     * @param area Areal
     * @param ownerName Navn på eier
     *
     * @throws IllegalArgumentException If the lotNumber, sectionNumber or {@link #area} is negative,
     * or if the ownerName is blank
     */
    public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, String name,
                    double area, String ownerName) throws IllegalArgumentException {
        if(municipalityNumber < 101 || municipalityNumber> 5054){
            throw new IllegalArgumentException("Municipalitynumber outside allowed range");
        }
        if(lotNumber<=0 || sectionNumber<=0 || area <= 0){
            throw new IllegalArgumentException("Lot/section number or area cannot be negative");
        }
        if (ownerName.isBlank()||municipalityName.isBlank()){
            throw new IllegalArgumentException("Owner/municipality name is required");
        }

        this.municipalityNumber = municipalityNumber;
        this.municipalityName = municipalityName;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.name = name;
        this.area = area;
        this.ownerName = ownerName;
    }

    public int getMunicipalityNumber() {
        return municipalityNumber;
    }

    public String getMunicipalityName() {
        return municipalityName;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public String getName() {
        return name;
    }


    /**
     * Sets the name of the lot. This is in case someone would like to change it at a later time

     * @param name The new name of the lot
     */
    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    /**
     * Sets a new size of the lot area. This is in the case of expansion or contraction of the lot
     *
     * @param area The new size of the area
     *
     * @throws IllegalArgumentException if the area given is not positive
     */
    public void setArea(double area)throws IllegalArgumentException {
        if (area <= 0){
            throw new IllegalArgumentException("Area has to be positive");
        }
        this.area = area;
    }


    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets a new name for the owner. In case the owner changes, or if the owner changes name, or if property is abandoned
     *
     * @param ownerName The new name of the owner
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Returns the property in the required format
     *
     * @return Returns the property in the format {@link #municipalityNumber}-{@link #lotNumber}/{@link #sectionNumber}
     */
    @Override
    public String toString() {
        return String.format("%d-%d/%d", municipalityNumber, lotNumber, sectionNumber);
    }
}
