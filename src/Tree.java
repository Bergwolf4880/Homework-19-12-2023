public class Tree extends Plant {

    private double maxHeight;

    public Tree(String nameOfPlant, double plantHeight, double maxHeight) {
        super(nameOfPlant, plantHeight);

        this.maxHeight = maxHeight;
    }
    private boolean isPlantGrown(){
        return getHeight()<maxHeight;
    }
    public double seasonChange(int season) {
        double temp=0;
        if (isPlantGrown()) {
            switch (season) {
                case 1 : temp = getHeight() * 0.3;
                case 2, 3 : temp = getHeight() * 1;
                case 4 : temp =  getHeight() * 0.5;
                break;
            };
        }return temp;
    }
    @Override
    public String toString() {
        return getNameOfPlant()+getHeight()+getSeasonOfTheYear();
    }
}