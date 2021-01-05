package TaskProgr.T1;

public class Cortage <T1, T2, T3> {
    private T1 elem1;
    private T2 elem2;
    private T3 elem3;

    public Cortage(T1 elem1, T2 elem2, T3 elem3) {
        this.elem1 = elem1;
        this.elem2 = elem2;
        this.elem3 = elem3;
    }

    public T1 getElem1() {
        return elem1;
    }

    public T2 getElem2() {
        return elem2;
    }

    public T3 getElem3() {
        return elem3;
    }
}
