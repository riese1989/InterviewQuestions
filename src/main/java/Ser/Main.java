package Ser;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat1 = new Cat("Vasya", "Green", 2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(cat1);
        objectOutputStream.close();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Cat cat2 = (Cat) objectInputStream.readObject();
        cat1.setAge(222);
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
