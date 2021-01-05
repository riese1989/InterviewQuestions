package Q4;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceA {

    @Transactional
    public void doSomething() {
        /* logic here */
    }

    public void doSomethingElse() {
        this.doSomething();
        /* logic here */
    }
}
