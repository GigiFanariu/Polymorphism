public class Test {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Lion lion = new Lion("Simba");
        Cow cow = new Cow("Bessie");

        System.out.println("Animal sound:");
        animal.animalSound();

        System.out.println("\nLion sound:");
        lion.animalSound();

        System.out.println("\nCow sound:");
        cow.animalSound();
    }
}
