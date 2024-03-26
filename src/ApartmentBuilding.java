public class ApartmentBuilding extends Building {
    Address address;
    int squareFootage;
    int totalUnits;


    public ApartmentBuilding(Address address, int squareFootage, int totalUnits) {
        super(address, squareFootage);
        this.totalUnits = totalUnits;
    }


}
