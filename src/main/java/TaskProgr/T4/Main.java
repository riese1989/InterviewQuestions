package TaskProgr.T4;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(array);
        while(arrayIterator.hasNext())  {
            System.out.println(arrayIterator.next());
        }
    }
}
