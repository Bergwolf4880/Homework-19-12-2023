public class Flower extends Plant {

    public Flower(String name, double plantHeight) {
        super(name, plantHeight);
    }

    public double seasonChange(int season) {
        double temp = switch (season) {
            case 2 -> getHeight() * 1;
            case 3 -> getHeight() * 1.1;
            case 1, 4 -> getHeight() * 0.5;
            default -> 0;
        };
        return temp;

    }
    @Override
    public String toString() {
        return getNameOfPlant() + getHeight() + getSeasonOfTheYear();
    }
}