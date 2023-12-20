public class Bush extends Plant {


    public Bush(String nameOfPlant, double plantHeight) {
        super(nameOfPlant, plantHeight);

    }
    public double seasonChange(int season) {
        double temp = switch (season) {
            case 1 -> getHeight();
            case 2 -> getHeight() * 1;
            case 3 -> getHeight() * 0.5;
            case 4 -> getHeight() * 0.2;
            default -> 0;
        };

        return temp;
    }
    @Override
    public String toString() {
        return getNameOfPlant() + getHeight() + getSeasonOfTheYear();
    }
}