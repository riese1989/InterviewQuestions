package Q2;

import java.util.Objects;

//можно поставить аннотацию Service
public class ServiceB {
    private final ServiceA a;

    public ServiceB(ServiceA serviceA) {
        this.a = Objects.requireNonNull(serviceA, "serviceA must not be null");
    }

    public void doB() {
        a.doA();
        /* ... logic ... */
    }
}
