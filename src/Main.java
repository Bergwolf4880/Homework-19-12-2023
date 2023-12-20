public class Main {
    public static void main(String[] args) {

        Tree tuja = new Tree("Туя", 1, 6);
        Bush roseHip = new Bush("Шиповник", 0.5);
        Flower gladiolus = new Flower("Гладиолус", 0.3);

        Plant[] plants = {tuja, roseHip, gladiolus};

        growBySeason(plants);


    }

    public static void changeSeasons() {

    }


    public static void growBySeason(Plant[] plants) {
        for (Plant plant : plants) {
            System.out.println(plant.seasonChange(3));
            System.out.println(plant);
        }
    }



    public static void actualGardenState() {


    }
}