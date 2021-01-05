package Q2;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("configuration3")
public class ServiceA {
    public void doA() { /* ... logic ... */ }
}
