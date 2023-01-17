package guru.springframework.sfdi.services;

import org.springframework.stereotype.Service;

//@Service - refactored to Java Configuration
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
