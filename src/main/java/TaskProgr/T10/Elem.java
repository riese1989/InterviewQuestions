package TaskProgr.T10;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Elem<T> {
    private static int currentId;
    private int id;
    private Elem next;
    private T value;

    public Elem(T value) {
        this.value = value;
        id = currentId++;
    }
}
