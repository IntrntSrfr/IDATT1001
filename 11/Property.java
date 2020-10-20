public class Property {

    private final int municipalityNumber;
    private final String municipalityName;
    private final int lotNumber;
    private final int sectionNumber;
    private final String name;
    private final double area;
    private final String ownerName;

    public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, String name,
                    double area, String ownerName) throws IllegalArgumentException {

        if(lotNumber<0 || sectionNumber<0 || area < 0){
            throw new IllegalArgumentException("Lot/section number or area cannot be negative");
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

    public double getArea() {
        return area;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return String.format("%d-%d/%d", municipalityNumber, lotNumber, sectionNumber);
    }
}
