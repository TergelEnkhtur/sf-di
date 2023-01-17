package guru.springframework.sfdi.services;

import org.springframework.stereotype.Service;

//@Service - refactored to Java Configuration
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
