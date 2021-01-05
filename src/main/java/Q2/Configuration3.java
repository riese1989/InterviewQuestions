package Q2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("configuration3")
public class Configuration3 {
//    @Autowired
//    private ServiceA serviceA;

    //не находит бин serviceA
    @Bean
    public ServiceB serviceB(ServiceA serviceA) {
        return new ServiceB(serviceA);
    }

//    @Bean
//    public ServiceA serviceA()  {
//        return new ServiceA();
//    }
}

