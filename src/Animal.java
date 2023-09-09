public class Animal {
    protected String animalName;

    public Animal(String name) {
        this.animalName = name;
    }

    public void animalSound() {
        System.out.println("Default animal sound");
    }
}

class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    public void animalSound() {
        System.out.println(animalName + " the Lion roars loudly!");
    }
}

class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    public void animalSound() {
        System.out.println(animalName + " the Cow says moo!");
    }
}
