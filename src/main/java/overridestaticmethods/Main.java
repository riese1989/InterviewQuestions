package overridestaticmethods;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.statMethod();
        Cat cat = new Cat();
        Cat.statMethod();
    }
}
