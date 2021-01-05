package overridestaticmethods;

public class Cat extends Animal {
    public static void statMethod()    {
        System.out.println("Static method of Cat");
    }
    @Override
    public void nonStaticMethod() {
        super.nonStaticMethod();
    }
}
