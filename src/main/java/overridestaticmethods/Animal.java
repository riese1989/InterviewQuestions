package overridestaticmethods;

public class Animal {
    public static void statMethod() {
        System.out.println("Static method of Animal");
    }
    public void nonStaticMethod()   {
        System.out.println("Non static method of Animal");
    }
}
