public abstract class Plant {

    private String nameOfPlant;

    private double height;

    private String seasonOfTheYear;

    public Plant(String nameOfPlant, double plantHeight) {
        this.nameOfPlant = nameOfPlant;
        this.height = plantHeight;
    }
    public double getHeight() {
        return height;
    }

    public String getNameOfPlant() {
        return nameOfPlant;
    }

    public String getSeasonOfTheYear() {
        return seasonOfTheYear;
    }
    public abstract double seasonChange(int season);
    public abstract String toString();
}
