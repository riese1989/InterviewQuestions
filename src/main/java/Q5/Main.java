package Q5;

import Q5.exception.Ex1;
import Q5.exception.Ex2;
import Q5.exception.Ex3;

public class Main {

    //Выбросится Ex3, так как при обработке Ex1 выбрасывается Ex2, соответственно отработает Ex3
    public static void main(String[] args) {
        try {
            throw new Ex1();
        } catch (final Ex1 e) {
            throw new Ex2();
        } finally {
            throw new Ex3();
        }
    }

}
