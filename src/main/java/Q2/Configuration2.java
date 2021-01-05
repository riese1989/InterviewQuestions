package Q2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("configuration2")
public class Configuration2 {
    @Autowired
    private ServiceA serviceA;

    @Bean
    public ServiceA serviceA() {
        return new ServiceA();
    }
}