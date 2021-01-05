package Q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {
    public final ServiceA serviceA;

    @Autowired
    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public void doSomethingCool() {
        serviceA.doSomethingElse(); //Транзакция не создастся, нужна аннотация Transactional над doSomethingElse
    }
}
