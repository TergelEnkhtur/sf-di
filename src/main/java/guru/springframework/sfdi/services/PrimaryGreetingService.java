package guru.springframework.sfdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary - refactored to Java Configuration
//@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
