import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class PropertyRegister {
    ArrayList<Property> properties;


    public PropertyRegister(ArrayList<Property> properties) {
        this.properties = new ArrayList<>();
    }

    public void RegisterProperty(Property p){
        properties.add(p);
    }

    public void ShowAllProperties(){
        properties.forEach(t-> System.out.println(t.toString()));
    }

    public Property GetPropertyByInfo(int munNr, int lotNr, int secNr){
        for(Property p : properties){
            if (p.getMunicipalityNumber() == munNr && p.getLotNumber() == lotNr && p.getSectionNumber() == secNr){
                return p;
            }
        }
        return null;
    }

    public List<Property> GetPropertiesByLotNr(int lotNr){
        return properties.stream().filter(t->t.getLotNumber()==lotNr).collect(Collectors.toList());
    }

    public double ShowTotalArea(){
        return properties.stream().mapToDouble(Property::getArea).sum();
    }
}
